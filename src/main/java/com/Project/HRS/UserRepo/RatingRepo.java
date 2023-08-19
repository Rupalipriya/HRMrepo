package com.Project.HRS.UserRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HRS.UserEntity.Rating;

public interface RatingRepo  extends JpaRepository<Rating, String>{
	
	//List<Rating> findByUserId(String userid);
	//Rating findByUserId(String userid);
}
