package com.sda.lombok.sample;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@EqualsAndHashCode
@Builder
@Data
public class SampleDto2 {

    String title;
    @EqualsAndHashCode.Exclude
    String author;
    @EqualsAndHashCode.Exclude
    LocalDate published;

    public static void main(String[] args) {
        SampleDto2 sampleDto = SampleDto2.builder()
                .title("title")
                .author("author1")
                .published(LocalDate.now())
                .build();
        SampleDto2 sampleDto2 = SampleDto2.builder()
                .title("title")
                .author("author2")
                .published(LocalDate.now())
                .build();

        // compare two objects by title
        boolean equals = sampleDto.equals(sampleDto2);
        System.out.println(equals);
    }
}
