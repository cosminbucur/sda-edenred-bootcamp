package com.sda.lombok.sample;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Value
@Builder
public class SampleDto {

    String title;
    String author;
    @PastOrPresent
    LocalDate published;

    public static void main(String[] args) {
        SampleDto sampleDto = SampleDto.builder()
                .title("title")
                .author("author")
                .published(LocalDate.now())
                .build();
        System.out.println(sampleDto);
    }
}
