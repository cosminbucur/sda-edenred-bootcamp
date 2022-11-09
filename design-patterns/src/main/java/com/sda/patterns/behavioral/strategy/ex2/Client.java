package com.sda.patterns.behavioral.strategy.ex2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Client {

    public static void main(String[] args) {
        List<String> list = List.of("b", "a", "c");
        Consumer<List<String>> bubbleSort = bubbleList ->
                System.out.println("List sorted using Bubble sort implementation");
        Function<List<String>, String> binarySearch = binaryList -> {
            return getString("list is binary searched");
        };
        Context context = new Context(bubbleSort, binarySearch);

        context.sort(list);
        context.search(list);

        System.out.println("---");

        Consumer<List<String>> quickSort = quickList -> System.out.println("List sorted using Quick sort implementation");
        Function<List<String>, String> linearSearch =
                linearList -> getString("list is linearly searched");
        context.setSortStrategy(quickSort);
        context.setSearchStrategy(linearSearch);
        context.sort(list);
        context.search(list);
    }

    private static String getString(String list_is_binary_searched) {
        System.out.println(list_is_binary_searched);
        return null;
    }
}
