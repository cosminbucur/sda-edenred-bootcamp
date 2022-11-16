package com.sda.lombok.server.dto;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Value
@Builder
public class PaperRequest {

    String title;
    String author;
    @PastOrPresent
    LocalDate published;
}
