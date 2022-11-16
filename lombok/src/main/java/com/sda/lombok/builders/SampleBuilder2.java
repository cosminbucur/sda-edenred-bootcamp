package com.sda.lombok.builders;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Builder
// hides the constructor to force usage of the Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SampleBuilder2 {

    String title;
    String author;
    LocalDate published = LocalDate.now();

    public static void main(String[] args) {
        SampleBuilder2 sampleDto = SampleBuilder2.builder()
                .title("title")
                .author("author")
                .build();
        System.out.println(sampleDto);
    }

}
