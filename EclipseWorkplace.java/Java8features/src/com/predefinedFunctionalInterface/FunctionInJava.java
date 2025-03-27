package com.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		/*
		 * Function;
		 * It will take a parameter, perform an action and based on that action it will
		 * return a value
		 */
		
		Function<String ,Integer> f=(s)->s.length();
		int res =f.apply("Hii");
		System.out.println(res);
		
		Function<Integer ,Integer> f1 = (s)->s*s;
		int res1 =f1.apply(4);
		System.out.println(res1);
	}
}
