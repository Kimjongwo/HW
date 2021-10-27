package com.example.Domain;

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
public class Member {

	@Id
	@Column(updatable = false)
	private String id;
	private String password;
	private String address;
	private String ph;
	private String email;
	private int age;
	private String sex;

	}