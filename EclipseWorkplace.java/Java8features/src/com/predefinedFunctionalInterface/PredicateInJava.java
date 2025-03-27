package com.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInJava {
	public static void main(String[] args) {
		/*
		 * Preducate:
		 * It holds a vakue (true, false)
		 * 
		 */
		
		Predicate<Integer> p= a-> a%2==0;
		System.out.println(p.test(71));
	}

}
