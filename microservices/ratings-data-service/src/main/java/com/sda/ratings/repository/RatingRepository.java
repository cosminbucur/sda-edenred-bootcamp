package com.sda.ratings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sda.ratings.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

}
