package com.sda.advanced.collections;

public class Command {

    private String commandLine;

    public Command(String commandLine){
        this.commandLine = commandLine;
        System.out.println("Command line: " + commandLine);
    }

    @Override
    public String toString() {
        return commandLine;
    }
}
