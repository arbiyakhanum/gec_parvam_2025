package introduction_to_java.firstprogram;

import java.util.Scanner;

public class ControlStatements {
	public static void main(String[] args) {
		/*
		 * if ,if else , else if and switch statement
		 * if (condition){
		 * }
		 * else{
		 * }
		 * if(condition){
		 * }
		 * else if (condition){
		 * }
		 * else if (condition){
		 * }
		 * else{
		 * }*/
		int a=30;
		int b=20;
		int c=50;
		
		if (a<b) {
		System.out.println("b is large");
		
		}
		else if(c>b) {
			System.out.println("c is greater than b");
			
		}
		else {
			System.out.println("a is large");
		}
		
		//swtich statement
		System.out.println("switch statement method 1 ");
		int day=6;
		switch(day) {
		case 1->System.out.println("Monday");
		case 2->System.out.println("Tuesday");
		case 3->System.out.println("Wednesday");
		case 4->System.out.println("Thursday");
		case 5->System.out.println("Friday");
		case 6->System.out.println("Saturday");
		case 7->System.out.println("Sunday");
		
		}
		System.out.println("switch statement method 2 ");
		int day1=6;
		switch(day1) {
		case 1:{System.out.println("Monday");
		break;
		}
		case 2:{System.out.println("Tuesday");
		break;
		}
		case 3:{System.out.println("Wednesday");
		break;
		}
		case 4:{System.out.println("Thursday");
		break;
		}
		case 5:{System.out.println("Friday");
		break;
		}
		case 6:{System.out.println("Saturday");
		break;
		}
		case 7:{System.out.println("Sunday");
		break;
		}
		}
		
			}
	
}


			
		
		
		
		
	
	
		
	


