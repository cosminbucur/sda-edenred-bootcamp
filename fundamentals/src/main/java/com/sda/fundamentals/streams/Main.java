package com.sda.fundamentals.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Alpha");
        stringList.add("Beta");
        stringList.add("Gamma");

        Stream<String> stream = stringList.stream();
/*
        List<String> listStream = stream.map(letter -> letter.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(listStream);
*/

        Consumer<String> stringConsumer = letter -> System.out.println(letter);
        Predicate<String> stringFilter = letter -> letter.startsWith("Gamma");

        stream.filter(stringFilter).forEach(stringConsumer);

        // ------------------ EXERCITIU ----------------------

        List<Author> authorList = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();

        // convert list to stream
        Stream<Book> bookStream = bookList.stream();

        // get authors
        Stream<Author> authorStream = bookStream.map(book -> book.getAuthor());

        //filter by age
        Stream<Author> authorsOlderThanFifty = authorStream.filter(author -> author.getAge() >= 50);

        // unique authors
        Stream<Author> uniqueAuthors = authorsOlderThanFifty.distinct();

        // limit first 15
        Stream<Author> limitedAuthors = uniqueAuthors.limit(15);

        // get author name
        Stream<String> authorNames = limitedAuthors.map(author -> author.getName());

        // to uppercase
        Stream<String> uppercasedAuthors = authorNames.map(name -> name.toUpperCase());

        // collect
        List<String> result = uppercasedAuthors.collect(Collectors.toList());

        bookList.stream()
                .map(book -> book.getAuthor())
                .filter(author -> author.getAge() >= 50)
                .distinct()
                .limit(15)
                .map(author -> author.getName())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        Set<Author> authors = authorStream.filter(author -> author.getAge() >= 50).limit(15).collect(Collectors.toSet());


    }

}
