package com.sda.info.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.sda.info.model.Book;

@Component
public class BookMapper {

    public List<BookResponse> toDto(List<Book> books) {
        return books.stream()       // convert list to stream
                .map(this::toDto)   // convert entity to dto
                .collect(Collectors.toList());  // convert stream to list
    }

    public BookResponse toDto(Book book) {
        BookResponse dto = new BookResponse();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        return dto;
    }

    public List<Book> toEntity(List<BookRequest> bookRequests) {
        List<Book> books = new ArrayList<>();
        for (BookRequest bookRequest : bookRequests) {
            books.add(toEntity(bookRequest));
        }
        return books;
    }

    public Book toEntity(BookRequest bookRequest) {
        Book entity = new Book();
        entity.setTitle(bookRequest.getTitle());
        entity.setAuthor(bookRequest.getAuthor());
        return entity;
    }

}
