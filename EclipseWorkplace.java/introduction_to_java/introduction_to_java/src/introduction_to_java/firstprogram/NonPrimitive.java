package introduction_to_java.firstprogram;

import java.util.Scanner;

public class NonPrimitive {
	public static void main(String[] args) {
		
		/*
		 * 1.array
		 * 
		 * 
		 * 2.String
//		 * String name=""*/
		int[] array1= {1,2,3,4,5,6};
		System.out.println(array1[4]);
		Scanner sc=new Scanner(System.in);
		
		String name="";
		System.out.println("enter the name:");
//		name=sc.next();
		name=sc.nextLine();
	    System.out.println("the name is :"+name);
		
		int age=0;
		System.out.println("Enter the student age");
		age=sc.nextInt();
		System.out.println("Age is :"+age);
		

		double marks=0;
		System.out.println("Enter the student marks");
		marks=sc.nextDouble();
		System.out.println("marks is :"+marks);
		sc.nextLine();
		
		char gender=0;
		System.out.println("Enter the student gender");
		gender=sc.nextLine().charAt(gender);
		System.out.println("gender is :"+gender);
		sc.nextLine();
		
		String adddress;
		System.out.println("Enter the student address");
		adddress=sc.next();
		System.out.println("address is :"+adddress);
	
		
		String branch;
		System.out.println("Enter the student branch");
		branch=sc.next();
		System.out.println("branch is :"+branch);
		
		
		
		
	
		
//		sc.next();
//		sc.nextLine();
//		
	
	}
}
