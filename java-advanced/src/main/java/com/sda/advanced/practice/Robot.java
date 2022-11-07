package com.sda.advanced.practice;
@FunctionalInterface
public interface Robot {

    Command execute(String order);
}
