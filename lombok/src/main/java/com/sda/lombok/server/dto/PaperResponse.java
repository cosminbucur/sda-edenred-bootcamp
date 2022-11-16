package com.sda.lombok.server.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
public class PaperResponse {

    private Long id;
    private String title;
    private String author;
    private LocalDate published;

}
