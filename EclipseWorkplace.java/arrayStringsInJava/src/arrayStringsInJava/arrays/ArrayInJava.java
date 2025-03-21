package arrayStringsInJava.arrays;

public class ArrayInJava {

	public static void main(String[] args) {
	/*
	 * Arrays in java
	 * 
	 * If we want to store a multiple values of the same datatypes
	 * ---------------------------------
	 * how to declare the array:
	 * <datatype> [] array_name = new <datatype>[size];
	 * 
	 * int[] array1 = new int[4];
	 * 
	 * ----------------------------------
	 * 
	 * How to declare and initialize the array:
	 * int [] arr = {1,2,3,4,5};
	 * 
	 * -----------------------------------
	 * Types:
	 * 1. 1D ->single row
	 * int [] arr = new int[3]
	 * 2. 2D ->2 rows
	 * int [][] arr= new int [3][4]            ->12 items
	 * 
	 */
  //inserting values in an array manully
		
		 int [] arr = new int[5];
		 arr[0] =10;
		 arr[1] =20;
		 arr[2] =30;
		 arr[3] =40;
		 arr[4] =50;
//		 arr[5] =60;  //if we print this  it will shows error( array index out of bound exception)
		 
		 
		
		 
		 //inserting the values in an array using for loop
		 
		 int [] arr1 = new int[5];
		 for(int j=0;j<=4;j++) {
			 arr1[j]=100;
			
		 }
		 //for each loop
		 for(var j: arr1) {
			 System.out.println(j + " ");
		 }
		 
		 

		 
		 
	}

}
