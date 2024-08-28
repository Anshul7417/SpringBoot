package com.telusko.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.telusko.springsecdemo.dao.UserRepo;
import com.telusko.springsecdemo.model.User;
import com.telusko.springsecdemo.model.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService {     // It is a class which implements UserDetailsService Interface

	@Autowired
	private UserRepo repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	// UserDetails interface needs to be implemented. It is implemented in Userprincipal class

	User user= repo.findByUsername(username);
	
	if (user==null) {
		System.out.println("User 404");
		throw new UsernameNotFoundException("User 404");
	}
		 return new UserPrincipal(user);
	}


	// It is a method which will find user in the db by username. It is basically a service layer so we need a repository layer
	// Now we will return the user object wrapped in UserPrincipal model for extra functionality

}
