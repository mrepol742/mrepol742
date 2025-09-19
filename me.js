#!/usr/bin/env node

'use strict'

const boxen = require("boxen");
const chalk = require("chalk");
const inquirer = require("inquirer");
const clear = require("clear");
const open = require("open");
const fs = require('fs');
const request = require('request');
const path = require('path');
const ora = require('ora');
const cliSpinners = require('cli-spinners');
clear();

const prompt = inquirer.createPromptModule();

const questions = [
    {
        type: "list",
        name: "action",
        message: "Me, I and Myself:",
        choices: [
            {
                name: `Send me an ${chalk.blueBright.bold("email")}?`,
                value: () => {
                    open("mailto:mrepol742@gmail.com");
                }
            },
            {
                name: `View my ${chalk.blueBright.bold("Portfolio")}?`,
                value: () => {
                    open("https://www.melvinjonesrepol.com");
                }
            },
            {
                name: `Want to Google ${chalk.blueBright.bold("me")}?`,
                value: () => {
                    open('https://www.google.com/search?q=melvin+jones+repol');
                }
            },
            {
                name: "Close.",
                value: () => {
                    console.log("Ara ara. Sayonara\n");
                }
            }
        ]
    }
];

const data = {
    name: chalk.bold.blue("             Melvin Jones 'Mj' Repol"),
    handle: chalk.white("@mrepol742"),
    work: `${chalk.white("Freelance Software Engineer")}`,
    twitter: chalk.gray("https://x.com/") + chalk.cyan("mrepol742"),
    github: chalk.gray("https://github.com/") + chalk.cyan("mrepol742"),
    linkedin: chalk.gray("https://linkedin.com/in/") + chalk.cyan("mrepol742"),
    facebook: chalk.gray("https://facebook/com/") + chalk.cyan("melvinjonesrepol"),
    web: chalk.gray("https://") +  chalk.cyan("melvinjonesrepol.com"),
    npx: chalk.blue("npx") + " " + chalk.white("mrepol742"),

    labelWork: "        ",
    labelTwitter: chalk.white.bold("    X:"),
    labelGitHub: chalk.white.bold("     GitHub:"),
    labelLinkedIn: chalk.white.bold("   LinkedIn:"),
    labelFacebook: chalk.white.bold("   Facebook:"),
    labelWeb: chalk.white.bold("        Web:"),
    labelCard: chalk.white.bold("       Card:")
};

const me = boxen(
    [
        `${data.name}`,
        ``,
        `${data.labelWork}  ${data.work}`,
        ``,
        `${data.labelTwitter}  ${data.twitter}`,
        `${data.labelGitHub}  ${data.github}`,
        `${data.labelLinkedIn}  ${data.linkedin}`,
        `${data.labelFacebook}  ${data.facebook}`,
        `${data.labelWeb}  ${data.web}`,
        ``,
        `${data.labelCard}  ${data.npx}`,
        ``,
        `${chalk.italic(
            "          Shinjitsu Wa Itsumo Hitotsu!"
        )}`
    ].join("\n"),
    {
        margin: 1,
        float: 'center',
        padding: 1,
        borderStyle: "single",
        borderColor: "blue"
    }
);

console.log(me);
const tip = [
    `Tip: ${chalk.cyanBright.bold(
        "cmd/ctrl + click"
    )} to open links above`,
    '',
].join("\n");
console.log(tip);

prompt(questions).then(answer => answer.action());
