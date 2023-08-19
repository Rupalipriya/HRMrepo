package com.Project.HRS.UserService;

import java.util.List;

import com.Project.HRS.UserEntity.Hotel;

public interface HotelService {
	Hotel save(Hotel hotel);
	Hotel getById(String id);
	List<Hotel>  getAllHotel();
}
