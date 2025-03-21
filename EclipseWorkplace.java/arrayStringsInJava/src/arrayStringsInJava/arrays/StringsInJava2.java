package arrayStringsInJava.arrays;

public class StringsInJava2 {

	public static void main(String[] args) {
	/* 1. equals
	 * 2. equalsignorecase
	 * 3. ==
	 * 4. concat
	 * 5. touppercase
	 * 6. tolowercase
	 * 7.trim
	 * 8. startwith
	 * 9.endswith
	 * 10.strip
	 * 11. equalsingorecase
	 * 12. isBlank()
	 */
		String str1= new String("Hello World");	
		String str2 = new String("hello world"); 
		
		//1. equals 
		System.out.println("Equals:" +str1.equals(str2));
		
		//2.equalsignorecase
		System.out.println("EqualsIgnorecase:" +str1.equalsIgnoreCase(str2));
		
		//3. ==
		System.out.println("=== :" +(str1==str2));
		
		//4. concat
		System.out.println("Concat:" +str1.concat(str2));
		
		//5. touppercase
		System.out.println("Uppercase:" +str1.toUpperCase());
		
		//6. tolowercase
		System.out.println("Lowercase:" +str1.toLowerCase());
		
		//7. trim
		System.out.println("Trim:" +str2.trim());
		
		//8. startswith
		System.out.println("StartsWith:" +str2.startsWith("lo"));
		
		//9. endswith
		System.out.println("Endswith:" +str2.endsWith("rld"));
		
		//10. strip
		System.out.println("Strip:" +str2.strip());
		
		//11. Blank
		System.out.println("IsBlank:" +str2.isBlank());
		 
		
		
	}

}
