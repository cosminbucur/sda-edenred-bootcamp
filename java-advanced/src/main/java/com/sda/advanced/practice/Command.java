package com.sda.advanced.practice;

import java.util.function.Function;

public class Command {
    private String commandLine;



    public Command(String commandLine) {
        this.commandLine = commandLine;
        System.out.println("command line: " + commandLine);

    }
    @Override
    public String toString() {
        return "Command{" +
                "commandLine='" + commandLine + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Robot robot = Command::new;
        robot.execute("who");
    }
}
