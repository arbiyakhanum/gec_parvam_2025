package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(10);
		list.add(67);
		list.add(30);
		//i need to filter based on the number and generate a list
//		Stream<Integer> stream=list.stream();
//		List<Integer> numbers=stream.filter((i)->i%2!=0).collect(Collectors.toList());
//		System.out.println(numbers);
		List<Integer> numbers=list.stream().filter((i)->i%2!=0).collect(Collectors.toList());
//		System.out.println(numbers);
	}

}