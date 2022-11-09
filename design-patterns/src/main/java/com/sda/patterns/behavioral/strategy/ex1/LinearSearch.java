package com.sda.patterns.behavioral.strategy.ex1;

public class LinearSearch implements SearchStrategy {

    @Override
    public String search(String input) {
        System.out.println("list is linearly searched");
        return null;
    }
}
