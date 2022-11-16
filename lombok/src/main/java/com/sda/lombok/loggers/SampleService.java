package com.sda.lombok.loggers;

import com.sda.lombok.server.dto.PaperMapper;
import com.sda.lombok.server.dto.PaperRequest;
import com.sda.lombok.server.dto.PaperResponse;
import com.sda.lombok.server.model.Paper;
import com.sda.lombok.server.repository.PaperRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// logger
@Slf4j

// dependencies
@AllArgsConstructor
@Service
public class SampleService {

    private final PaperRepository paperRepository;
    private final PaperMapper paperMapper;

    public List<PaperResponse> findAll() {
        log.debug("find all papers");

        return paperRepository.findAll().stream()
                .map(paperMapper::toDto)
                .collect(Collectors.toList());
    }
}
