package com.Project.HRS.UserServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HRS.UserEntity.User;
import com.Project.HRS.UserRepo.UserRepo;
import com.Project.HRS.UserService.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo  userRepo; 

	@Override
	public User save(User user) {
		User user1=	userRepo.save(user);
		return user1;
	}

	@Override
	public User getById(String id) {
		Optional<User> optinal=userRepo.findById(id);
		User user1= optinal.get();
		return user1;
	}

}
