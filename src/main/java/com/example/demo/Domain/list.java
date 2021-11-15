package com.example.demo.Domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class list {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long on;
	
	private int count;
	
	private String price;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="uid")
	private User u;
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Product pd;
}
