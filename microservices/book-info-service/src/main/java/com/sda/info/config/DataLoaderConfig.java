package com.sda.info.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sda.info.model.Book;
import com.sda.info.repository.BookRepository;

@Configuration
public class DataLoaderConfig {

    @Autowired
    private BookRepository bookRepository;

    @Bean
    CommandLineRunner data() {
        return args -> bookRepository.saveAll(createBooks());
    }

    private List<Book> createBooks() {
        return List.of(
                new Book("Karamazov brothers", "Fyodor Dostoievsky"),
                new Book("The metamorphosis", "Franz Kafka"),
                new Book("Game of thrones", "George Martin")
        );
    }
}
