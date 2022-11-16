package com.sda.lombok.server.controller;


import com.sda.lombok.server.dto.PaperRequest;
import com.sda.lombok.server.dto.PaperResponse;
import com.sda.lombok.server.service.PaperService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@AllArgsConstructor
@RequestMapping("api/papers")
@RestController
public class PaperController {

    private final PaperService paperService;

    @PostMapping
    public ResponseEntity<PaperResponse> create(@Valid @RequestBody PaperRequest request) {
        return new ResponseEntity<>(paperService.save(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PaperResponse>> findAll() {
        return new ResponseEntity<>(paperService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaperResponse> findById(@PathVariable(name = "id") Long id) {
        PaperResponse response = paperService.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<PaperResponse>> getPapersByAuthor(@RequestParam(name = "authorName") String authorName) {
        List<PaperResponse> responses = paperService.findByAuthor(authorName);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaperResponse> update(@PathVariable(name = "id") Long id,
                                                @RequestBody PaperRequest request) {
        PaperResponse response = paperService.update(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(name = "id") Long id) {
        paperService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
