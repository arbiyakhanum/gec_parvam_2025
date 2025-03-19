package introduction_to_java.firstprogram;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		System.out.println("enter a number between 1 to 7");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String res = switch(N) {
		case 1,2,3,4,5->"weekday";
		case 6,7->"week end";
		default->"invalid";
		
		};
		System.out.println("the result is : "+res);
	}

}
