package com.typecastingInJava;

public class TypeCastingInJava {
	public static void main(String[] args) {
		/*
		 * Type casting:
		 * 
		 * conversio of one data type to another
		 * 
		 * byte ->  short -> int -> long -> float ->double 
		 * ------------------------------------------------
		 * 
		 * 1.Implicit type casting
		 * 
		 * byte ->  short -> int -> long -> float ->double 
		 * ------------------------------------------------
		 * 
		 * 2.explicit type casting:
		 * 
		 * double -> float -> long -> int -> short-> byte
		 * 
		 * 
		 * 
		 */
		
		//1.Implicit type casting
		
		int a1= 20;
		long a2=a1;
		
		System.out.println("Int:" +a1);
		System.out.println("Long:" +a2);
		
		//2.Explicit type casting
		long a3=20;
		int a4=(int)a2;
		
		System.out.println("Long:" +a3);
		System.out.println("Int:" +a4);
	}

}
