package com.sda.lombok.constructors;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class StaticFactoryMethod {

    String title;
    String author;
    LocalDate published;

    public static void main(String[] args) {
        StaticFactoryMethod factory = StaticFactoryMethod.of("title", "author", LocalDate.now());
        System.out.println(factory);
    }
}
