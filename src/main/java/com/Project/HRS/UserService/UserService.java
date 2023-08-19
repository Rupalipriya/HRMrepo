package com.Project.HRS.UserService;

import com.Project.HRS.UserEntity.User;

public interface UserService {
	User save(User user);
	User getById(String id);
}
