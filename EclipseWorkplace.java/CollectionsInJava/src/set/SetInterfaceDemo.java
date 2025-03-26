package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		/*
		 * Set:
		 * When you represent a group of inidividual object as a single entity
		 * where the insertion order is not preserved, duplicate will not allow
		 * then we should got for set Interface
		 * 
		 * 
		 * 1. order is not preserved
		 * 2. duplicate will not allow
		 * 3. random access is there
		 */
		
		Set<Integer> set =new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(52);
		set.add(80);
		set.add(65);
		set.add(65); //65 will be displayed only once
		
		System.out.println("Set:" +set);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(76);
		list.add(29);
		list.add(76);
		list.add(32);
		list.add(32); //32 will be displayed 2 times( bcuz list allows duplicates)
		System.out.println("List:" +list);
		
		Set<Integer> set1 =new HashSet<Integer>();
		
		System.out.println("Set1:"+set1);
		
		

	}

}
