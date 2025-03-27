package com.functional_interface;

@FunctionalInterface
interface Interface2{
	public void display();
	
}
@FunctionalInterface
interface Interface3{
	public int String1(String s);
	
}

@FunctionalInterface
interface Interface4{
	public int int1(int a, int b);
	
}




public class FunctionInterfaceInJava1 {

	public static void main(String[] args) {
		
		Interface2 i= ()-> System.out.println("Hello world 1");
		i.display();
		
		Interface3 i1= s-> s.length();
		int res= i1.String1("Hello world");
		System.out.println("Result is:" +res);
		
		Interface4 i2= (a,b)-> a+b;
		int res1= i2.int1(5,1);
		System.out.println("Result of addition is :" +res1);	

	}

}
