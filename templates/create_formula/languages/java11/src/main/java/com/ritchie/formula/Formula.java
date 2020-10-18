package com.ritchie.formula;

import com.github.tomaslanger.chalk.Chalk;

public class Formula {

    private final String inputText;
    private final boolean inputBoolean;
    private final String inputList;
    private final String inputPassword;

    public void Run() {
        System.out.println("Hello World!");
        System.out.println(Chalk.on(String.format("My name is %s.", inputText)).green());
        if (inputBoolean)
            System.out.println(Chalk.on("I’ve already created formulas using Ritchie.").cyan());
        else
            System.out.println(Chalk.on("I’m excited in creating new formulas using Ritchie.").red());
        System.out.println(Chalk.on(String.format("Today, I want to automate %s.", inputList)).yellow());
        System.out.println(Chalk.on(String.format("My secret is %s.", inputPassword)).magenta());
    }

    public Formula(String inputText, String inputList, String inputPassword, boolean inputBoolean) {
        this.inputText = inputText;
        this.inputList = inputList;
        this.inputPassword = inputPassword;
        this.inputBoolean = inputBoolean;
    }
}
