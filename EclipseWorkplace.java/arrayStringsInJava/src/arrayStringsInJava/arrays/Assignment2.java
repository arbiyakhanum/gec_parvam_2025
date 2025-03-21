package arrayStringsInJava.arrays;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
	
		System.out.println("Enter the no of rows and column:");
		Scanner sc=new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int [][] arr= new int [row][col];
		
		for(int i=0;i<row;i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] =sc.nextInt();
				
			}
			
		}
		System.out.println("Array elements are:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println(arr[i][j] +"");
				
			}
			System.out.println();
			sc.close();
			
		}
		
	}

}
