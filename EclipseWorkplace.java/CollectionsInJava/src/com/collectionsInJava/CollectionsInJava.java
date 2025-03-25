package com.collectionsInJava;

public class CollectionsInJava {

	public static void main(String[] args) {
		/*
		 * why we need collection:
		 * --->to overcome the drawback of array we have to go for collection
		 * 
		 * --------------------------------------
		 * 
		 *  drawbacks of an array:
		 *  1. Fixed size
		 *  2. same data type elements
		 *  3. we cannot reduce the size of an array
		 *  
		 *  -------------------------------------
		 *  
		 *  advantages of an array:
		 *  
		 *  1.random access
		 *  2.type safety - the elements inside the array are based on datatype
		 *  3.type casting- to print elements in array,no need to type cast
		 */
		
		int [] arr= new int[2];
		arr[0]=22;
		arr[1]=20;
		System.out.println((int)arr[0]); //no need to type casting
		System.out.println(arr[1]);

	}

}
