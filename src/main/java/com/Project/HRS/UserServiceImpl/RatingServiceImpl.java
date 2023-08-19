package com.Project.HRS.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HRS.UserEntity.Rating;
import com.Project.HRS.UserRepo.RatingRepo;
import com.Project.HRS.UserService.RatingService;
@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	 private RatingRepo  ratingRepo; 
 
	@Override
	public Rating save(Rating rating) {
		Rating rating1=ratingRepo.save(rating);
		return rating1;
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepo.findAll();
	}
//   @Override
//	public List<Rating> getRatingByUserId(String userid) {
//	   
//	   
//		return ratingRepo.findByUserId(userid);
//	}

//	@Override
//	public List<Rating> getRatingByUserId(String userid) {
//		
//		return (List<Rating>) ratingRepo.findByUserId(userid);
//	}



}
