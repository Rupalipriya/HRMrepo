package com.Project.HRS.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.HRS.UserEntity.User;

public interface UserRepo  extends JpaRepository<User, String>{

}
