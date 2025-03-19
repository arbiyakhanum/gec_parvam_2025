package com.geccrud.SpringBootCRUD.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.geccrud.SpringBootCRUD.dto.StudentDTO;
import com.geccrud.SpringBootCRUD.models.Student;
import com.geccrud.SpringBootCRUD.repository.StudentRepository;

@Service //tell the spring boot that it is service class
public class StudentServices {
	
	private final StudentRepository studentRepository;
	
	public StudentServices(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	//To get list of students
	public List<Student> getAllStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}
	
	public void saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setFname(studentDTO.getFname());
		student.setLname(studentDTO.getLname());
		student.setEmail(studentDTO.getEmail());
		student.setPhone(studentDTO.getPhone());
		student.setAddress(studentDTO.getAddress());
		studentRepository.save(student);	
	}
	
	public Student getStudent(Long id) {
		Student student =studentRepository.findById(id).get();
		return student;
	}

	public void updateStudent(StudentDTO studentDTO, Long id) {
		Student student=studentRepository.findById(id).get();
		student.setFname(studentDTO.getFname());
		student.setLname(studentDTO.getLname());
		student.setEmail(studentDTO.getEmail());
		student.setPhone(studentDTO.getPhone());
		student.setAddress(studentDTO.getAddress());
		studentRepository.save(student);
		
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
		
	}
}