package com.Project.HRS.UserServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HRS.UserEntity.Hotel;
import com.Project.HRS.UserRepo.HotelRepo;
import com.Project.HRS.UserService.HotelService;
@Service
public class HotelServiceImpl implements HotelService {
     @Autowired
	 private HotelRepo hotelRepo;
	
	@Override
	public Hotel save(Hotel hotel) {
		Hotel hotel1=hotelRepo.save(hotel);
		return hotel1;
	}

	@Override
	public Hotel getById(String id) {
		Optional<Hotel> optional=hotelRepo.findById(id);
		Hotel hotel1=optional.get();
		return hotel1;
	}

	@Override
	public List<Hotel> getAllHotel() {
		
		return hotelRepo.findAll();
	}

	

}
