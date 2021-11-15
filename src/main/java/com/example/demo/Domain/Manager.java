package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Manager {

	@Id
	private String Mid;
	
	private String Mpassword;
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Product pd;
}
