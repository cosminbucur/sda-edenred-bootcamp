package com.sda.lombok.builders;

import com.sda.lombok.sample.SampleChild;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.Value;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class SampleSingular {

    String title;
    String author;
    LocalDate published;
    @Singular
    List<SampleChild> children;

    public static void main(String[] args) {
        SampleSingular sampleDto = SampleSingular.builder()
                .title("title")
                .author("author")
                .child(new SampleChild())
                .child(new SampleChild())
                .build();
        System.out.println(sampleDto);
    }

}
