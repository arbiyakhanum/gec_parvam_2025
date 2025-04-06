package com.SpringBootformValidation.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.SpringBootformValidation.dto.StudentDTO;
import com.SpringBootformValidation.models.Student;
import com.SpringBootformValidation.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents(){
		List<Student> students =studentRepository.findAll();
		return students;
		}

	public void saveStudent(StudentDTO studentDTO) {
		Student student =new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
		
	}

	public void deleteStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
		
	}

	public StudentDTO editStudent(Long id) {
		Student student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		return studentDTO;
		
	}
	public void updateStudent(StudentDTO studentDTO,Long id) {
		Student student = studentRepository.findById(id).get();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
		
	}	

}
