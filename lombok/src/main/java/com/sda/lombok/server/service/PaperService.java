package com.sda.lombok.server.service;

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
public class PaperService {

    private final PaperRepository paperRepository;
    private final PaperMapper paperMapper;

    // CRUD

    public PaperResponse save(PaperRequest request) {
        log.debug("saving paper {}", request);

        Paper existingPaper = paperRepository.findByTitle(request.getTitle());
        if (existingPaper != null) {
            throw new RuntimeException("paper already exists");
        }

        Paper paper = paperMapper.toEntity(request);
        Paper savedPaper = paperRepository.save(paper);
        return paperMapper.toDto(savedPaper);
    }

    public List<PaperResponse> findAll() {
        log.debug("find all papers");

        return paperRepository.findAll().stream()
                .map(paperMapper::toDto)
                .collect(Collectors.toList());
    }

    public PaperResponse findById(Long id) {
        log.debug("find author by id: {}", id);

        return paperRepository.findById(id)
                .map(paperMapper::toDto)
                .orElseThrow(() -> new RuntimeException("paper not found"));
    }

    public List<PaperResponse> findByAuthor(String author) {
        log.debug("find papers by author: {}", author);

        return paperRepository.findByAuthor(author).stream()
                .map(paperMapper::toDto)
                .collect(Collectors.toList());
    }

    public PaperResponse update(Long id, PaperRequest request) {
        log.debug("updating paper id: {} and request body : {}", id, request);

        return paperRepository.findById(id)
                .map(author -> paperMapper.toEntity(author, request))
                .map(paperRepository::save)
                .map(paperMapper::toDto)
                .orElseThrow(() -> new RuntimeException(("paper not found")));
    }

    public void delete(Long id) {
        log.debug("deleting author with id: {}", id);

        paperRepository.deleteById(id);
    }

}
