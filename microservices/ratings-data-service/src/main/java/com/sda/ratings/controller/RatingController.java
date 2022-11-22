package com.sda.ratings.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sda.ratings.dto.UserRatings;
import com.sda.ratings.model.Rating;
import com.sda.ratings.service.RatingService;

@RequestMapping("/ratings")
@RestController
public class RatingController {

    public RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @GetMapping("/{bookId}")
    public Rating getRating(@PathVariable("bookId") String bookId) {
        return new Rating(bookId, 5);
    }

    @PostMapping("/users/{userId}")
    public ResponseEntity<Rating> rate(@PathVariable("userId") String userId, @RequestBody Rating rating) {
        return new ResponseEntity<>(ratingService.save(userId, rating), HttpStatus.CREATED);
    }

    // avoid returning lists in APIs, in case we make changes
    @GetMapping("/users/{userId}")
    public UserRatings getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1111", 5),
                new Rating("2222", 4)
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setRatings(ratings);
        return userRatings;
    }
}
