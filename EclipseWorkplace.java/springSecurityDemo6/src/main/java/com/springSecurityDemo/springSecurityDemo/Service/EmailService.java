package com.springSecurityDemo.springSecurityDemo.Service;



import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

@Service
public class EmailService {
	
	private JavaMailSender mailSender;
	private TemplateEngine templateEngine;
		
	

}
