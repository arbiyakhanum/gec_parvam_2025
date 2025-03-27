package com.collectionsInJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * 
		 *--> Array List is a improved version of array(Dynamic Array)
		 *--> Array List underline data structures is Dynamic array
		 *--> Array list allow duplicate
		 *--> Arraylist allow random Access(using index)
		 *--> ArrayList will allow null value
		 *--> ArrayList will preserve the order of insertion
		 *
		 */

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(50);
		list.add(50);
		list.add(null);
		list.add(null);
		list.add(65);
		list.add(12);
		list.add(1);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		list.remove(5);
		System.out.println(list);
		list.clear();	
	
	}

}
