package arrayStringsInJava.arrays;

public class StringsInJava {

	public static void main(String[] args) {
		/*
		 * Strings:
		 * It is a group of characters
		 * Ex:Table
		 * Need to enclose within " "
		 * 
		 * ---------------------
		 * How to declare the Strings:
		 * 1. using string literal1
		 * String var_name="string_name";
		 * 
		 * 2.Using new keyword
		 * String var_name= new String("string_name");	
		 */
		
		String str1="String1";
		String str2=new String("String1");
		String str3="String1";
		String str4=new String("String1");
//		System.out.println(str1);
//		System.out.println(str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);//check the reference address
		System.out.println(str1==str3);//true
		System.out.println(str1.equals(str3));//check the values//true
		System.out.println(str2==str4);//false
		System.out.println(str2.equals(str4));//true
		
		String str5=new String("String5");
		str5 = str5.concat("Hello");
		System.out.println(str5);
		
		
		
		
		

	}

}