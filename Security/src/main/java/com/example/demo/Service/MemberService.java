package com.example.demo.Service;

import com.example.demo.Domain.Member;

public interface MemberService {

	Member getMember(Member member);

	void insertMember(Member member);

}