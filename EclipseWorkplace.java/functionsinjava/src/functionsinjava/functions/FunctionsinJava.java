package functionsinjava.functions;

public class FunctionsinJava {
	
	
	//1 -- when return a value <access parameter> shoulf be a datatype
	 public int add(int a,int b) {
		 return a+b;
	 }
	 
	 //2-- when return a value <access parameter> shoulf be a datatype
	 public void add1(int a,int b) {
		 System.out.println("addition of c and d :" +(a+b));
	 }
	 
	 //3
	 public int add2() {
		 return 100;
	 }
	 
	 //4
	 public void add3() {
		 System.out.println("Hello java");
	 }

	public static void main(String[] args) {
		
		/*
		 * Functions/methods in java:
		 * 
		 * <access modifier> return_type function_name(parameters){
		 * code
		 * }
		 * 
		 * public void add(int a,intb){
		 * syso(a+b);
		 * ------------------------------------------
		 * 
		 * 2 types of functions:
		 * 1.built-in -> next(),nextLine(),println(),equals()
		 * 2. User defined:
		 * 
		 * -------------------------------------------
		 * 
		 * a. function return a value  accepting a parameter
		 * b. function not return a value accepting a parameter
		 * c. function return a value not accepting a parameter
		 * d. function not return a value not accepting a parameter
		 */
		
		FunctionsinJava obj1= new FunctionsinJava();
		int res =obj1.add(50, 9);
		//1
		System.out.println("Result:" +res);
		
		//2
		obj1.add1(10,20);
		
		//3
		int res1=obj1.add2();
		System.out.println("Result:" +res1);
		
		//4
		obj1.add3();
	}

}
