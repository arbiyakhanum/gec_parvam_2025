package set;

import java.util.TreeSet;

public class TreesetIJava {

	public static void main(String[] args) {
		//This will arrange the items in acsending order	
		TreeSet<Integer> treeSet=new TreeSet<Integer>(); 
		
		//This will arrange the items in acsending order
		TreeSet<Integer> treeSet1=new TreeSet<Integer>((a,b) ->b-a);

		treeSet.add(2);
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(12);
		System.out.println(treeSet);
		
		treeSet1.add(2);
		treeSet1.add(10);
		treeSet1.add(100);
		treeSet1.add(12);
		System.out.println(treeSet1);

	}

}
