package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Domain.Member;
import com.example.Service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/")
	public String loginView() {
		return "members";
	}

	@PostMapping("/login")
	public String login(Member member, Model model) {
		Member findMember = memberService.getMember(member);

		if (findMember != null 
				&& findMember.getPassword().equals(member.getPassword())) {
			model.addAttribute("member", findMember);
			return "forward:members";
		} else {
			return "redirect:login";
		}
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@PostMapping("/add")
	public String add(Member member, Model model) {
		Member findmember = memberService.getMember(member);
		return null;
		
	}
	
	@GetMapping("/members")
	public String members(Model model) {
		List<Member> members = memberService.getMemberList();
		
		model.addAttribute("members", members);
		return "members";
	}
	
	
}