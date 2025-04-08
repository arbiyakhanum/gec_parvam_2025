package com.SpringBootformValidation.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBootformValidation.dto.StudentDTO;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;
import com.SpringBootformValidation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	private final StudentService studentService;
	private final StudentRepository studentrepository;
	
	// Constructor injection

	public StudentController(StudentService studentService, StudentRepository studentrepository) {
		super();
		this.studentService = studentService;
		this.studentrepository = studentrepository;
	}

	@GetMapping({ "", "/" })
	public String home(Model model) {
		List<Student> students=studentService.getAllStudents();
		model.addAttribute("students",students);
		return "home";
	}

	@GetMapping({ "/add-student" })
	public String addStudent(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
		return "add-student";
	}

	@PostMapping("/add-student")
	public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO,BindingResult result, Model model) {
		
		if(studentDTO.getImage().isEmpty()) {
			result.addError(new FieldError("StudentDTO", "image", "Image is required")); 
		}
		if(result.hasErrors()) {
		    return "add-student";
		}
		System.out.println(studentDTO.getName()+"2");
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
	
	@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam(name = "id")  Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
		
	}
	@GetMapping("/std-edit")
	public String editStudent(@RequestParam(name = "id")  Long id,Model model) {
		StudentDTO studentDTO=studentService.editStudent(id);
		Student student =studentrepository.findById(id).get();
		model.addAttribute("studentDTO",studentDTO);
		model.addAttribute("student",student);
		return "edit-student";
		
	}
	
	@PostMapping("/edit-student")
	public String UpdateStudent(@Valid @ModelAttribute StudentDTO studentDTO,BindingResult result, Model model,@RequestParam(name = "id") Long id) {
		if(result.hasErrors()) {
			Student student =studentrepository.findById(id).get();
			model.addAttribute("student", student);
		    return "edit-student";
		}
		studentService.updateStudent(studentDTO,id);
		return "redirect:/";
	}

}