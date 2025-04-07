package com.SpringBootformValidation.service;


import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
		MultipartFile image= studentDTO.getImage();
		Date createdAt = new Date();
		String storeImageName= createdAt.getTime()+"_"+image.getOriginalFilename();
		
		try {
			String uploadDir="public/images";
			Path uploadPath= Paths.get(uploadDir);
			if(!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			
		try {
			InputStream inputStream=image.getInputStream();
			Files.copy(inputStream, Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Student student =new Student();
		student.setName(studentDTO.getName());
		student.setEmail(studentDTO.getEmail());
		student.setAge(studentDTO.getAge());
		student.setPassword(studentDTO.getPassword());
		student.setImagePath(storeImageName);
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
