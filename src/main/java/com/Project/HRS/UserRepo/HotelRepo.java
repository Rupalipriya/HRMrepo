package com.Project.HRS.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HRS.UserEntity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

}
