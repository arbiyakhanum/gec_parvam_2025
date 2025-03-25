package com.wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 * Java is pure oop or not?
		 * ---> No.... ->(bcuz of primitive datatypes)
		 * -------------------------------------
		 * 
		 * primitive data types:
		 * byte , short , int , long , float ,double,char,boolean 
		 * 
		 * String name = new String ("Mohan");
		 * 
		 * --------------------------------------
		 * 
		 * Collection:
		 * ---> to store group of individual objects as a single entity
		 * ---> it works only for objects but not for primitive datatype
		 * --->to overcome of this we use classes called wrapper classes
		 * 
		 * --------------------------------------
		 * 
		 * wrapper classes:
		 * byte ---> Byte
		 * short ---> Short
		 * int ---> Int
		 * long ---> Long
		 * float ---> Float
		 * double ---> Double
		 * char ---> Character
		 * boolean ---> Boolean
		 * 
		 * 
		 * 		 
		 * */
		
		//1. Auto boxing ---> from primitive to wrapper
		System.out.println("--------------------Integer---------------------");
		int a=100;		
		Integer i = Integer.valueOf(a);  //explicit conversion
		//Integer i=a;  //implicit conversion  // here i is an object bcuz Interger is a class
		System.out.println("Int:" +a);
		System.out.println("Integer:" +i);
		System.out.println("Integer type:" +i.getClass().getName());
		
		
		//2. Unboxing	
		Integer i1=20;	
		int a1=i1.intValue(); //explicit conversion		
		//Integer i=a;  //implicit conversion  // here i is an object bcuz Interger is a class
		System.out.println("Int:" +a1);
		System.out.println("Integer:" +i1);
		System.out.println("Integer type:" +i1.getClass().getName());
		
		
		//1.auto boxing
		System.out.println("--------------------Byte---------------------");
		byte a2=50;		
		Byte i2 = Byte.valueOf(a2); 
		System.out.println("Int:" +a2);
		System.out.println("Integer:" +i2);
		System.out.println("Integer type:" +i2.getClass().getName());
		
		//2. Unboxing
		Byte i3 = 60; 
		byte a3=i3.byteValue();		
		System.out.println("Int:" +a3);
		System.out.println("Integer:" +i3);
		System.out.println("Integer type:" +i3.getClass().getName());
	
		//1.auto boxing
		System.out.println("--------------------Short---------------------");
		short a4=50;		
		Short i4 = Short.valueOf(a4); 
		System.out.println("Int:" +a4);
		System.out.println("Integer:" +i4);
		System.out.println("Integer type:" +i4.getClass().getName());
		
		Short i5 = 90; 
		short a5=i5.shortValue();		
		System.out.println("Int:" +a5);
		System.out.println("Integer:" +i5);
		System.out.println("Integer type:" +i5.getClass().getName());
		

	}

}
