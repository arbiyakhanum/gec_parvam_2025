package com.collectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		
		System.out.println("Before :" +list);
		
		/*Collections
		 * it is a utility classes that provides methods to work with collection
		 * 
		 */

		//sort
		Collections.sort(list);
		System.out.println("After:" +list);
		
		System.out.println("Min value:" + Collections.min(list));
		System.out.println("Max value:" + Collections.max(list));
		Collections.reverse(list);
		System.out.println(list);
		
		
		
		
		
	}

}
