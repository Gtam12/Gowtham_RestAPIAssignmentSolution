package com.greatlearning.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.employee.entity.User;
import com.greatlearning.employee.repository.UserRepository;
import com.greatlearning.employee.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.getUserByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return new MyUserDetails(user);
	}

}
