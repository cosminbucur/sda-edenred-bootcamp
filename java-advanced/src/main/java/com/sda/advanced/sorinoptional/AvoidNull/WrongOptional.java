package com.sda.advanced.sorinoptional.AvoidNull;

import java.util.Optional;

public class WrongOptional {
    public static void main(String[] args) {
        useOptional();
    }

    public static void useOptional() {
        Optional<String> stringOptional = Optional.of("test");
        System.out.println(stringOptional);

        stringOptional.ifPresent(System.out::println);
    }
}
