package map;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {

	public static void main(String[] args) {
		/*
		 * Map:
		 * 
		 * When you represent a group of individual object as a single entity
		 * in the forn of key value pair then we should go for map interface
		 * 
		 */
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		System.out.println(map);
		
		map.remove(3); //remove the value( 3,"three")
		System.out.println(map);
		System.out.println(map.containsKey(3));
		//return false bcuz we have removed the value 3 and now the value
		//'3' is not present in the list
		System.out.println(map.containsValue("four")); //return true bcuz "four" is present 
		

	}

}
