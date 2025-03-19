package introduction_to_java.firstprogram;

import java.util.Scanner;

public class UserInputValues {
	public static void main(String[] args) {
		int stdage=0;
		System.out.println("enter student age");
		Scanner sc=new Scanner(System.in);
		stdage=sc.nextInt();
		System.out.println("The age of student is :" +stdage);
		
		byte number=0;
		System.out.println("enter a number in the range -127 to +127");
	    number=sc.nextByte();
		System.out.println("The number is: " +number);
		
		short srt=0;
		System.out.println("Enter the number inn the range of short -32000 to +32000:");
		srt = sc.nextShort();
		System.out.println("The number is :" +srt);
		
		float flt=0;
		System.out.println("The float value can be entered ");
		flt=sc.nextFloat();
		System.out.println("The value is:" +flt);
		//once we use int value if we want to use string after that we use nextline ..this is called ad buffering
		sc.nextLine();
		
		//characyer
		System.out.println("Enter the gender:");
		char gender=sc.nextLine().charAt(0);
		System.out.println("Gender is :"+gender);
	
	}
}
