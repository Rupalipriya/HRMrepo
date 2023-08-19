package com.Project.HRS.UserService;

import java.util.List;

import com.Project.HRS.UserEntity.Rating;

public interface RatingService {
	Rating save(Rating rating);
	List<Rating>getAllRating();
	//List<Rating> getRatingByUserId(String userid);
	//List<Rating> getRating
}
