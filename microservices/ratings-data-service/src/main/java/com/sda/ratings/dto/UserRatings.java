package com.sda.ratings.dto;

import java.util.List;

import com.sda.ratings.model.Rating;

public class UserRatings {

	private List<Rating> ratings;

	public UserRatings() {
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
}
