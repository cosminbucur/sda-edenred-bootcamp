package com.sda.advanced.functional.streams;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStreams2 {

    public static void main(String[] args) {

        // create empty stream
        Stream<String> emptyStream = Stream.empty();

        testStreamFromArray();

        testMethodReference();

    }

    public static void testMethodReference() {
        // create stream using builder()
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .build();

        // use method reference to print all items in stream
        // class name :: non static method
        streamBuilder.forEach(System.out::println);

//        streamBuilder.forEach(letter -> System.out.println(letter));
    }

    public static void splitStringIntoStreamOfLetters() {
        // convert string to an int stream
        IntStream streamOfChars = "abc".chars();

        // use regex to extract each letter from string
        String input = "a, b, c";
        Stream<String> streamOfStrings = Pattern.compile(", ").splitAsStream(input);
        streamOfStrings.forEach(letter -> System.out.println(letter));
    }

    private static void testStreamFromArray() {
        // stream of arrays using Stream.of()
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        String[] stringArray = {"a", "b", "c"};

        // convert some array to a stream
        Arrays.stream(stringArray);

        // store the result of Arrays.stream
        Stream<String> streamFromArray = Arrays.stream(stringArray);
        Stream<String> partialStreamFromArray = Arrays.stream(stringArray, 0, 2);

        partialStreamFromArray.forEach(letter -> System.out.println(letter));
    }
}
