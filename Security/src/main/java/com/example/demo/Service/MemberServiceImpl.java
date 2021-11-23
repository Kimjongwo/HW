package com.example.demo.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Member;
import com.example.demo.Repository.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository memberRepo;
	
	public Member getMember(Member user) {
		Optional<Member> findMember = memberRepo.findById(user.getId());
		if(findMember.isPresent())
			return findMember.get();
		else return null;
	}

	
	public void insertMember(Member member) {
		memberRepo.save(member);
	}
}
