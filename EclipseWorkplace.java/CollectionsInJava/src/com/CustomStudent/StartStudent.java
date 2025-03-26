package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {
	
    // all the classes are present in other file (Student)
	
	public static void main(String[] args) {
	Student std1=new Student("Bhuvan",21,21);
	Student std2=new Student("Akhilesh",30,24);
	Student std3=new Student("Mohan",11,22);
	
	List<Student> students =new ArrayList<>();
	students.add(std1);
	students.add(std2);
	students.add(std3);
	students.add(new Student("Mohid",76,3));
	
//	students.remove(0);
//	System.out.println("After removing:"+students);
	System.out.println("Before");
	System.out.println(students);
	
	
	Collections.sort(students,(s1,s2) -> s2.getAge() - s1.getAge());
	//the age will  be arranged in descending order
	System.out.println("\n after sorting by age:");
	System.out.println(students);
	
	Collections.sort(students,(s1,s2) -> s1.getRoll_no() - s2.getRoll_no()); 
	//the rollno will  be arranged in acscending order
	System.out.println("\n after sorting by Rollno:");
	System.out.println(students);
	
	Collections.sort(students,(s1,s2) -> s1.getName().charAt(0) - s2.getName().charAt(0));
	//the name will  be arranged in ascending order
	System.out.println("\n after sorting by Name:");
	System.out.println(students);
	}

}
