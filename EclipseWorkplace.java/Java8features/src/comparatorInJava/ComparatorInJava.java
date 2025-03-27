package comparatorInJava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class funInterface implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;  //large to small
//		return o1-o2;  //small to large
	}
	
}


public class ComparatorInJava {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(3);
		list.add(33);
		list.add(89);
		Collections.sort(list, new funInterface());
		System.out.println(list);
		Collections.sort(list, (a,b) -> a-b);
		System.out.println(list);
		
		
	}

}
