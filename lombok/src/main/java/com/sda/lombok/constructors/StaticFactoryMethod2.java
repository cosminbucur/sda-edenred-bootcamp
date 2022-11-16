package com.sda.lombok.constructors;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor(staticName = "of")
public class StaticFactoryMethod2 {

    private final String title;
    private final String author;
    private final LocalDate published;

    public static void main(String[] args) {
        StaticFactoryMethod2 factory = StaticFactoryMethod2.of("title", "author", LocalDate.now());
        System.out.println(factory);
    }
}
