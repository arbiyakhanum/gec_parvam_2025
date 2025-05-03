package com.springSecurityDemo.springSecurityDemo.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springSecurityDemo.springSecurityDemo.Repository.StudentRepository;
import com.springSecurityDemo.springSecurityDemo.models.Student;

public class CustomUserDetailsService implements UserDetailsService{
	
	private StudentRepository studentRepository;
	
	public CustomUserDetailsService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    Student student = studentRepository.findByEmail(username)
	            .orElseThrow(() -> new UsernameNotFoundException("username not found: " + username));
	    return new CustomUserDetails(student);
	}


}
