package com.example.demo.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository UserRepo;
	
	public User getMember(User user) {
		Optional<User> findMember = UserRepo.findById(user.getId());
		if(findMember.isPresent())
			return findMember.get();
		else return null;
	}

	public void insertUser(User user) {
		UserRepo.save(user);
	}
}
