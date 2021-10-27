package com.example.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
