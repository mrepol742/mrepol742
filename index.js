#!/usr/bin/env node
import boxen from "boxen";
import chalk from "chalk";
import open from "open";
import { select, Separator } from "@inquirer/prompts";

const profile = {
  name: "Melvin Jones Repol",
  role: "Software Engineer",
  tagline: "Building dependable software since 2018",
  email: "mrepol742@gmail.com",
  command: "npx mrepol742",
};

const groups = [
  [
    ["Web", "https://melvinjonesrepol.com"],
    ["Blog", "https://blog.melvinjonesrepol.com"],
    ["Tools", "https://tools.melvinjonesrepol.com"],
    ["Shortlinks", "https://shrtly.melvinjonesrepol.com"],
    ["Designs", "https://web-designs.melvinjonesrepol.com"],
    ["WakaTime", "https://wakatime.melvinjonesrepol.com"],
  ],
  [
    ["Webvium", "https://www.webvium.com"],
    ["Hall of Codes", "https://www.hallofcodes.org"],
  ],
  [
    ["GitHub", "https://github.com/mrepol742"],
    ["LinkedIn", "https://linkedin.com/in/mrepol742"],
    ["YouTube", "https://youtube.com/@mrepol742"],
    ["Facebook", "https://facebook.com/mrepol742"],
  ],
  [
    [
      "Reviews",
      "https://www.trustpilot.com/review/www.melvinjonesrepol.com",
      "trustpilot.com/melvinjonesrepol",
    ],
  ],
];

// Make URLs clickable in terminals that support OSC 8 hyperlinks
// (iTerm2, Windows Terminal, VS Code, kitty, ...).
const supportsHyperlinks =
  process.stdout.isTTY && !process.env.NO_COLOR && process.env.TERM !== "dumb";

const link = (url, label) =>
  supportsHyperlinks ? `\u001B]8;;${url}\u0007${label}\u001B]8;;\u0007` : label;

const stripScheme = (url) => url.replace(/^https?:\/\/(www\.)?/, "");

const prettyUrl = (url, display) => {
  const text = display ?? stripScheme(url);
  const i = text.lastIndexOf("/") + 1;
  // Only dim the base when there's a path/handle to highlight after it.
  const styled =
    i > 0
      ? chalk.gray(text.slice(0, i)) + chalk.cyan(text.slice(i))
      : chalk.cyan(text);
  return link(url, styled);
};

function renderCard() {
  const labels = [...groups.flat().map(([l]) => l), "Card"];
  const labelWidth = Math.max(...labels.map((l) => l.length)) + 1;
  const row = (label, value) =>
    `${chalk.bold.white((label + ":").padStart(labelWidth))}  ${value}`;

  const plainRows = [
    ...groups
      .flat()
      .map(
        ([l, u, d]) =>
          `${(l + ":").padStart(labelWidth)}  ${d ?? stripScheme(u)}`,
      ),
    `${"Card:".padStart(labelWidth)}  ${profile.command}`,
  ];
  const width = Math.max(
    ...plainRows.map((r) => r.length),
    profile.tagline.length,
  );
  const center = (plain, styled) =>
    " ".repeat(Math.max(0, Math.floor((width - plain.length) / 2))) + styled;

  const lines = [
    center(profile.name, chalk.bold.blue(profile.name)),
    center(profile.role, chalk.white(profile.role)),
    "",
    ...groups.flatMap((g) => [
      ...g.map(([label, url, d]) => row(label, prettyUrl(url, d))),
      "",
    ]),
    row("Card", `${chalk.blue("npx")} ${chalk.white("mrepol742")}`),
    "",
    center(profile.tagline, chalk.italic.gray(profile.tagline)),
  ];

  return boxen(lines.join("\n"), {
    margin: 1,
    padding: 1,
    borderStyle: "round",
    borderColor: "blue",
    textAlignment: "left",
    title: chalk.blue("@mrepol742"),
    titleAlignment: "center",
  });
}

const url = (label) => groups.flat().find(([l]) => l === label)[1];
const go = (target) => () => open(target);
const b = (text) => chalk.blueBright.bold(text);

const choices = [
  { name: `Send me an ${b("email")}`, value: go(`mailto:${profile.email}`) },
  new Separator(),
  { name: `Visit my ${b("portfolio")}`, value: go(url("Web")) },
  { name: `Read the ${b("blog")}`, value: go(url("Blog")) },
  { name: `Browse useful ${b("tools")}`, value: go(url("Tools")) },
  { name: `Shorten a ${b("link")}`, value: go(url("Shortlinks")) },
  { name: `See ${b("web designs")}`, value: go(url("Designs")) },
  { name: `Check my ${b("WakaTime")} stats`, value: go(url("WakaTime")) },
  new Separator(),
  { name: `Try the ${b("Webvium")} browser`, value: go(url("Webvium")) },
  { name: `Join ${b("Hall of Codes")}`, value: go(url("Hall of Codes")) },
  new Separator(),
  { name: `Follow on ${b("GitHub")}`, value: go(url("GitHub")) },
  { name: `Connect on ${b("LinkedIn")}`, value: go(url("LinkedIn")) },
  { name: `Watch on ${b("YouTube")}`, value: go(url("YouTube")) },
  { name: `Read ${b("reviews")} on Trustpilot`, value: go(url("Reviews")) },
  new Separator(),
  { name: "Exit", value: () => {} },
];

async function main() {
  console.log(renderCard());

  if (!process.stdin.isTTY || !process.stdout.isTTY) return;

  console.log(
    `Tip: ${chalk.cyanBright.bold("cmd/ctrl + click")} to open links above\n`,
  );

  try {
    const action = await select({
      message: "What would you like to open?",
      choices,
      pageSize: 15,
    });
    await action();
  } catch (err) {
    // Ctrl+C inside the prompt is a normal way out, not an error.
    if (err?.name !== "ExitPromptError") throw err;
  }
}

main().catch((err) => {
  console.error(chalk.red(err?.message ?? err));
  process.exit(1);
});
