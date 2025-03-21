package arrayStringsInJava.arrays;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		/*write a program to take the user input values include 
		 * size and store inside array and print it
		 */
		
		System.out.println("Enter the Size of an array:");
		Scanner sc = new Scanner(System.in);
		int  size= sc.nextInt();
		int [] arr= new int[size];
		
		System.out.println("Enter the Values of an array");
		for (int i=0;i<arr.length; i++) {
			System.out.println("Enter the " +i+ "th element of an array");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are:");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j] + " ");
			
		}
		sc.close();
		
			
		//for single value for the given size
		/* int [] arr1 = new int[5];
		 
		 System.out.println("Enter the number");
		 int  a= sc.nextInt();
		 
		 for( int i=0;i<=4;i++) {
			 arr1[i]=a;
			 System.out.println(arr1[i]);
			System.out.println("Enter the number");
		 Scanner sc = new Scanner(System.in);
		 int  a= sc.nextInt();
		 }
			 */
		
		/*assignment2
		 * take user input as char from user
		 */

	}

}
