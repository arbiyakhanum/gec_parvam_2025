package com.collectionsInJava;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {
		/*
		 * List:
		 * --> It is a child interrface of collection
		 * --> It will contain some of the built in methods that used inside a 
		 * list implemented class only
		 * --> When you represent a grpu[ of individual object as a single entity where
		 * order is preserved and index based access and duplicate is allowed
		 * 
		 * 
		 * To display the datatype of each element in a collection, we to type cast each 
		 * element if needed
		 * 
		 */
		
		
		List list = new ArrayList();
		list.add(2);
		list.add("Hii");
		list.add(23.2);
		System.out.println(list);
		String str=(String) list.get(1); //index of "hii" is 1
		System.out.println(str);
		
		double value=(double) list.get(2);
		System.out.println(value);
		
		int num=(int) list.get(0);
		System.out.println(num);
		
		
	}

}
