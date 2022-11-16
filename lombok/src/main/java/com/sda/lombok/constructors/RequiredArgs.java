package com.sda.lombok.constructors;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class RequiredArgs {

    @NonNull
    String title;
    String author;
    LocalDate published;

    public static void main(String[] args) {
        RequiredArgs requiredArgs = new RequiredArgs("title");
        System.out.println(requiredArgs);
    }
}
