package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {

	public static void main(String[] args) {
		/*
		 * Generics:
		 * to provide the type safety and to avoid the type casting in collection,
		 * then we should go for generics
		 * 
		 */
		char [] arr= {'a','b','c'}; //type safety -using char
		char firstEle=arr[0];
		System.out.println(firstEle);
		
		
		//without genetics
		List arr1=new ArrayList();
		arr1.add(12);
		arr1.add(30.37);
		arr1.add("hii");
		int value=(int) arr1.get(0);
		System.out.println(value);
		
		//generics
		List<Integer> list=new ArrayList<>();
		list.add(9);
		list.add(23);
		
		int a =list.get(1);
		System.out.println(a);
		System.out.println(list);
		

	}

}
