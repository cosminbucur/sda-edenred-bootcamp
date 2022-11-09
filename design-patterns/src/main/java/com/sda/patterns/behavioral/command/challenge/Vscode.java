package com.sda.patterns.behavioral.command.challenge;

public class Vscode implements Editor {

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
