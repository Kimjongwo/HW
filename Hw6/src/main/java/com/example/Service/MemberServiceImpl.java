package com.example.Service;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Domain.Member;
import com.example.Repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepo;
		
	public void insertMember(Member member) {
		memberRepo.save(member);
	}
	
	public Member searchemember(Member member) {
		return memberRepo.findById(member.getPh()).get();
	}

	
	public void updatemember(Member member) {
		Member findmember = memberRepo.findById(member.getId()).get();
		
		findmember.setPassword(member.getPassword());
		findmember.setAddress(member.getAddress());
		findmember.setPh(member.getPh());
		findmember.setEmail(member.getEmail());
		findmember.setAge(member.getAge());
		findmember.setSex(member.getSex());
		memberRepo.save(findmember);
	}

	public void deletemember(Member member) {
		memberRepo.deleteById(member.getId());
	}
	
	public Member getMember(Member member) {
		Optional<Member> findMember = memberRepo.findById(member.getId());
		if(findMember.isPresent())
			return findMember.get();
		else return null;
	}

	
	public List<Member> getMemberList(Member member) {
		return (List<Member>) memberRepo.findAll();
	}

	
	public List<Member> getMemberList() {
		return (List<Member>) memberRepo.findAll();
	}
}