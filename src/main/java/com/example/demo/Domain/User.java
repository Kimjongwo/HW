package com.example.demo.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class User {

	@Id
	private String id;
	
	private String password;
	
	private String name;
	
	private String address;
	
	private String phonenum;
	
	private String email;
	
	private String question;
	
	private String answer;
}
