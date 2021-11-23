package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	protected void configuare(HttpSecurity http) throws Exception {
		http
			.httpBasic()
			.and()
			.csrf().disable()
			.authorizeRequests().antMatchers("/", "/signin", "/insertuser").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/signin").permitAll()
			.loginProcessingUrl("/login")
			.defaultSuccessUrl("/main");
	}
}
