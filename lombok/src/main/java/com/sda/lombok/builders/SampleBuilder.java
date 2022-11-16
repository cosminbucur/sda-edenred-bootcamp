package com.sda.lombok.builders;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
public class SampleBuilder {

    String title;
    String author;
    LocalDate published = LocalDate.now();

    // how to ignore a field in the builder
    @Builder
    public SampleBuilder(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        SampleBuilder sampleDto = SampleBuilder.builder()
                .title("title")
                .author("author")
                .build();
        System.out.println(sampleDto);
    }

}
