package com.sda.testing.advanced.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sda.testing.advanced.dto.PaperRequest;
import com.sda.testing.advanced.dto.PaperResponse;
import com.sda.testing.advanced.service.PaperService;

@RequestMapping(PaperController.API_PAPERS)
@RestController
public class PaperController {

    public static final String API_PAPERS = "/api/papers";
    private final PaperService paperService;

    @Autowired
    public PaperController(PaperService paperService) {
        this.paperService = paperService;
    }

    @PostMapping
    public ResponseEntity<PaperResponse> create(@RequestBody PaperRequest request) {
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
        List<PaperResponse> papers = paperService.findByAuthor(authorName);
        return new ResponseEntity<>(papers, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PaperResponse> update(@PathVariable(name = "id") Long id,
                                                @RequestBody PaperRequest request) {
        PaperResponse response = paperService.update(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PaperResponse> partialUpdate(
            @PathVariable(name = "id") Long id,
            @RequestBody PaperRequest request) {
        PaperResponse response = paperService.partialUpdate(id, request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Long id) {
        paperService.delete(id);
        return new ResponseEntity<>("paper deleted", HttpStatus.OK);
    }
}
