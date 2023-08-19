package com.Project.HRS.UserController;

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

import com.Project.HRS.UserEntity.Hotel;
import com.Project.HRS.UserService.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/save")
	public ResponseEntity<Hotel> saveEntity(@RequestBody Hotel hotel){
		Hotel hotel2=hotelService.save(hotel);
		return new ResponseEntity<Hotel>(hotel2,HttpStatus.CREATED);
		
	}
	@GetMapping("/getbyid/{id}")
	 public ResponseEntity<Hotel> getById(@PathVariable String id){
		Hotel hotel2=hotelService.getById(id);
		return new ResponseEntity<Hotel>(hotel2,HttpStatus.OK);
	}
	@GetMapping("/getallhotels")
	public ResponseEntity<List<Hotel>>getAllHotel(){
		List<Hotel> hotel2=hotelService.getAllHotel();
		return new ResponseEntity<List<Hotel>>(hotel2,HttpStatus.OK);
	}
	
	
}
