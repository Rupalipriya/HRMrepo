package com.Project.HRS.UserController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.HRS.UserEntity.Rating;
import com.Project.HRS.UserService.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	private RatingService ratingService;
	private Logger logger=LoggerFactory.getLogger(RatingController.class);
	
	@PostMapping("/save")
	public ResponseEntity<Rating> save(@RequestBody Rating rating){
		logger.info("save method response");
		Rating rating1=ratingService.save(rating);
		logger.info("result of  response");
		return new ResponseEntity<Rating>(rating1,HttpStatus.CREATED) ;
	}
	@GetMapping("/getallrating")
	public ResponseEntity<List<Rating>> getAllRating(){
		logger.info("get method response");
		List<Rating> List1=ratingService.getAllRating();
		logger.info("get method result  response");
		return new  ResponseEntity<List<Rating>>(List1,HttpStatus.OK);
	}
//	@GetMapping("/getratingbyuserid/{userid}")
//	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userid) {
//	List<Rating> List2=ratingService.getRatingByUserId(userid);
//		return new ResponseEntity<List<Rating>>(List2,HttpStatus.OK);
//	}
	
	
	
	}


