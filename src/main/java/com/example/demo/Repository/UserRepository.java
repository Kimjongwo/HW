package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Domain.User;

public interface UserRepository extends CrudRepository<User, String> {

}