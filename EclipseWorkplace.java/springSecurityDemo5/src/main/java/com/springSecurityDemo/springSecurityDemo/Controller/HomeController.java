package com.springSecurityDemo.springSecurityDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springSecurityDemo.springSecurityDemo.DTO.StudentDTO;
import com.springSecurityDemo.springSecurityDemo.service.StudentService;


//we have anotation for Rest API is @RestController 
@Controller
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	
	
	 public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	@GetMapping({"/"," "})
	 public String home() {
		 return "home";
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
		 return "redirect:/";
	 } 
	 
	 @GetMapping("/std_details")
	 public String std_details() {
		 return "std_details";
	 }
	 
	 
	 @GetMapping("/login")
	 public String login() {
		 return "login";
	 }
	 
	 

}