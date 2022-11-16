package com.sda.lombok.builders;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Accessors(chain = true)
@Getter
@Setter
public class SampleAccessor {

    String title;
    String author;
    LocalDate published = LocalDate.now();

    public static void main(String[] args) {
        SampleAccessor sampleDto = new SampleAccessor();

        // how to chain setters
        sampleDto.setTitle("title")
                .setAuthor("author")
                .setPublished(LocalDate.now());

        System.out.println(sampleDto);
    }

}
