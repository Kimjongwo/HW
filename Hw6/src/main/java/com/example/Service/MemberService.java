package com.example.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.Domain.Member;

public interface MemberService {

	void insertMember(Member member);
	
	Member searchemember(Member member);
	
	void updatemember(Member member);
	
	void deletemember(Member member);
	
	List<Member> getMemberList(Member member);

	List<Member> getMemberList();
	
	Member getMember(Member member);
}
