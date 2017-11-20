package com.user.test.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;



public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Autowired
	 private UserDetailsService userDetailsService;

	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
	 http
	 .authorizeRequests()
	 .antMatchers("/resources/**").permitAll()
	 .anyRequest().authenticated()
	 .and()
	 .formLogin()
	 .loginPage("/login")
	 .permitAll()
	 .and()
	 .logout()
	 .permitAll();
	 }

	 @Autowired
	 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	 auth.userDetailsService(userDetailsService);
	 }

}
