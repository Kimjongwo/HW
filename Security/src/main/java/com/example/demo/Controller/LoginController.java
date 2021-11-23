package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Domain.Member;
import com.example.demo.Repository.MemberRepository;

@Controller
public class LoginController {

	//@Autowired
	//private MemberRepository memberrepo;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}
	
	@PostMapping("/signin")
	public String signin(Member user) {
		return "index";
	}
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/insertuser")
	public String insert() {
		return "insertuser";
	}

	@PostMapping("/insertuser")
	public String insert(Member user) {
		//memberrepo.save(user);
		return "signin";
	}
}
