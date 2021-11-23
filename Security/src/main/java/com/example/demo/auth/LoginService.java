package com.example.demo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Member;
import com.example.demo.Repository.MemberRepository;

@Service
public class LoginService implements UserDetailsService{
	
	@Autowired
	private MemberRepository memberrepo;
	
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException{
		/*Member member = memberrepo.findByMember(id);
		if(member == null) {
			throw new UsernameNotFoundException(id);
		}
		return User.builder()
				.username(member.getId())
				.password(member.getPassword())
				.build();*/
		return null;
	}
}
