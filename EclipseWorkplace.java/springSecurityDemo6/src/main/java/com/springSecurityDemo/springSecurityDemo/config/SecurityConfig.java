package com.springSecurityDemo.springSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.springSecurityDemo.springSecurityDemo.Repository.StudentRepository;
import com.springSecurityDemo.springSecurityDemo.Service.CustomUserDetailsService;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class SecurityConfig {
	private StudentRepository studentRepository;

	public SecurityConfig(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new CustomUserDetailsService(studentRepository);
	}
	
	@Bean
	public DaoAuthenticationProvider doAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwordEncoder());
		provider.setUserDetailsService(userDetailsService());
		return provider;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    return http
	        .authorizeHttpRequests(auth ->auth
	        		.requestMatchers("/user").hasRole("USER")
	        		.requestMatchers("/user").hasAnyRole("USER","ADMIN")
	        		.requestMatchers("/admin").hasRole("ADMIN")
	        		.requestMatchers("/", "/about", "/contact", "/register").permitAll()
	                .anyRequest().authenticated()  // All other requests require authentication
	        )
	        .formLogin(login -> login
	            .loginPage("/login")
	            .loginProcessingUrl("/login")  // The URL that processes login form submission
	            .defaultSuccessUrl("/std_details", true)  // Redirect to 'std_details' after login
	            .permitAll()
	        )
	        .logout(logout -> logout
	            .logoutUrl("/logout")
	            .logoutSuccessUrl("/login?logout=true")  // Redirect to login with logout success message
	            .permitAll()
	        )
	        .build();
	}

}
