package com.example.demo.Service;

import com.example.demo.Domain.User;

public interface UserService {

	User getMember(User member);

	void insertUser(User user);

}