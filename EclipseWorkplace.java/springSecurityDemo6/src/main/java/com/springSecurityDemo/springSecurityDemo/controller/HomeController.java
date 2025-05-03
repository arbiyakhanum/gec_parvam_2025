package com.springSecurityDemo.springSecurityDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springSecurityDemo.springSecurityDemo.DTO.StudentDTO;
import com.springSecurityDemo.springSecurityDemo.Service.StudentService;


//we have anotation for Rest API is @RestController 
@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	 public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	 @GetMapping({"/", " "})
	 public String home() {
	     return "home";  // Ensure you have a home.html template
	 }

	 
	 @GetMapping("/about")
	 public String about() {
		 return "about";
	 }
	 
	 @GetMapping("/contact")
	 public String contact() {
		 return "contact";
	 }
	 
	 @GetMapping("/register")
	 public String register(Model model) {
		 StudentDTO studentDTO = new StudentDTO();
		 model.addAttribute("studentDTO",studentDTO); 
		 return "register";
	 }
	 
	 @PostMapping("/register")
	 public String register(@ModelAttribute StudentDTO studentDTO, RedirectAttributes redirectAttributes) {
		 studentService.storeStudent(studentDTO);
		 redirectAttributes.addFlashAttribute("successMessage","Student saved succesfully");
		 return "redirect:/login";
	 } 
	 
	 @GetMapping("/std_details")
	 public String std_details(Model model) {
		 return "std_details";
	 }
	 
	 
//	 @GetMapping("/login")
//	 public String login(@RequestParam(value = "logout", required = false) String logout, Model model) {
//	     if (logout != null) {
//	         model.addAttribute("logoutMessage", "You have been logged out successfully.");
//	     }
//	     return "login";  // Ensure this is the correct view for the login page
//	 }
	 
	 
	 @GetMapping("/user")
	 public String user() {
		 return "user";
	 }
	 
	 @GetMapping("/admin")
	 public String admin() {
		 return "admin";
	 }
	 
	 
	 

	 
	 

}