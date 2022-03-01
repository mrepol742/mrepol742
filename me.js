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
        message: "What you want to do?",
        choices: [
            {
                name: `Send me an ${chalk.green.bold("email")}?`,
                value: () => {
                    open("mailto:mrepol742@gmail.com");
                }
            },
            {
                name: `View my ${chalk.magentaBright.bold("Portfolio")}?`,
                value: () => {
                    open("https://mrepol742.github.io");
                }
            },
            {
                name: `View my ${chalk.redBright.bold("Projects")}?`,
                value: () => {
                    open('https://mrepol742.github.io#projects');
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
    name: chalk.bold.green("             Melvin Jones 'Mj' Repol"),
    handle: chalk.white("@amrepol742"),
    work: `${chalk.white("Software Engineer at ")} ${chalk.hex("#4285f4").bold("Webvium")}`,
    twitter: chalk.gray("https://twitter.com/") + chalk.cyan("mrepol742"),
    github: chalk.gray("https://github.com/") + chalk.green("mrepol742"),
    linkedin: chalk.gray("https://linkedin.com/in/") + chalk.blue("mrepol742"),
    web: chalk.cyan("https://mrepol742.github.io"),
    npx: chalk.red("npx") + " " + chalk.white("mrepol742"),

    labelWork: chalk.white.bold("       Work:"),
    labelTwitter: chalk.white.bold("    Twitter:"),
    labelGitHub: chalk.white.bold("     GitHub:"),
    labelLinkedIn: chalk.white.bold("   LinkedIn:"),
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
        `${data.labelWeb}  ${data.web}`,
        ``,
        `${data.labelCard}  ${data.npx}`,
        ``,
        `${chalk.italic(
            "Shinjitsu Wa Itsumo Hitotsu"
        )}`
    ].join("\n"),
    {
        margin: 1,
        float: 'center',
        padding: 1,
        borderStyle: "single",
        borderColor: "green"
    }
);

console.log(me);
const tip = [
    `Tip: Try ${chalk.cyanBright.bold(
        "cmd/ctrl + click"
    )} on the links above`,
    '',
].join("\n");
console.log(tip);

prompt(questions).then(answer => answer.action());