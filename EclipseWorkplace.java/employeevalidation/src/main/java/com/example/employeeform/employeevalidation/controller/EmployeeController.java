package com.example.employeeform.employeevalidation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.employeeform.employeevalidation.dto.EmployeeDTO;
import com.example.employeeform.employeevalidation.model.Employee;
import com.example.employeeform.employeevalidation.repository.EmployeeRepository;
import com.example.employeeform.employeevalidation.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	private final EmployeeService employeeService;
	private final EmployeeRepository employeeRepository;

	// Constructor injection
	public EmployeeController(EmployeeService employeeService, EmployeeRepository employeeRepository) {
		this.employeeService = employeeService;
		this.employeeRepository = employeeRepository;
	}

	@GetMapping("/")
	public String home(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "home";
	}

	@GetMapping("/add-employee")
	public String addEmployeeForm(Model model) {
		model.addAttribute("employeeDTO", new EmployeeDTO());
		return "add_employee";
	}

	@PostMapping("/add-employee")
	public String addEmployee(@Valid @ModelAttribute("employeeDTO") EmployeeDTO employeeDTO, BindingResult result,
			RedirectAttributes attributes, Model model) {

		Employee existingEmployee = employeeRepository.findByEmail(employeeDTO.getEmail());

		if (existingEmployee != null) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}
		if (employeeDTO.getImage() == null || employeeDTO.getImage().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "image", "Image is required"));
		}
		if (employeeDTO.getDocument() == null || employeeDTO.getDocument().isEmpty()) {
			result.addError(new FieldError("employeeDTO", "document", "Document is required"));
		}

		if (result.hasErrors()) {
			return "add_employee";
		}

		employeeService.saveEmployee(employeeDTO);
		attributes.addFlashAttribute("success", "Employee added successfully!");
		return "redirect:/";
	}

	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam int id, RedirectAttributes attributes) {
		employeeService.deleteEmployee(id);
		attributes.addFlashAttribute("delete", "Employee deleted successfully!");
		return "redirect:/";
	}

	@GetMapping("/edit-employee")
	public String editEmployeeForm(@RequestParam int id, Model model) {
		EmployeeDTO employeeDTO = employeeService.getEmployeeById(id);
		Employee employee = employeeRepository.findById(id).orElse(null);

		if (employee == null) {
			return "redirect:/";
		}

		model.addAttribute("employeeDTO", employeeDTO);
		model.addAttribute("employee", employee);
		return "edit-employee";
	}

	@PostMapping("/edit-employee")
	public String updateEmployee(@Valid @ModelAttribute("employeeDTO") EmployeeDTO employeeDTO, BindingResult result,
			@RequestParam int id, RedirectAttributes attributes, Model model) {

		Employee employeeWithSameEmail = employeeRepository.findByEmail(employeeDTO.getEmail());

		if (employeeWithSameEmail != null && employeeWithSameEmail.getId() != id) {
			result.addError(new FieldError("employeeDTO", "email", "Email already exists"));
		}

		if (result.hasErrors()) {
			Employee employee = employeeRepository.findById(id).orElse(null);
			model.addAttribute("employee", employee);
			return "edit-employee";
		}

		employeeService.updateEmployee(employeeDTO, id);
		attributes.addFlashAttribute("edit", "Employee updated successfully!");
		return "redirect:/";
	}
}
