package linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
		/*
		 * Linked List:
		 * 
		 * linked list underline data structure is doubly linked list
		 * linked list allow duplicates
		 * linked list allow random access
		 * linked list will allow null value
		 * linked list will preserve the order of insertion
		 * 
		 */
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(45);
		list.add(30);
		list.add(null);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(2));
		
		
		/*COMPARING ARRAY LIST AND LINKED LIST
		 * 
		 * linked list underline data structure is duoubly linked list
		 * array list dynamic array
		 * 
		 * linked list will occupy more memory(3nodes)
		 * arraylist will occupy less memory
		 * 
		 * When ever there is a continuous operation on deletion we should go for linked 			list
		 * When ever there is a continuous operation on deletion we should not go for array
		 * 
		 * Insertion in between is easy in linked list
		 * 
		*/
	}

}