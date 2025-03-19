package introduction_to_java.firstprogram;

public class LoopingStatement {

	public static void main(String[] args) {

		/*
		 * for loop 
		 * syntax:for(intialization; condition;  inc/dec)
		 * eg: for(int i=0; i<=5;  i++)
		 *  
		 * while loop
		 * syntax
		 * while(cond){
		 * 	inc/dec
		 * }
		 * eg:
		 * while(i<9){
		 * 	i++;
		 * }
		 * 
		 * do-while loop
		 * syntax:
		 * do{
		 * 	statements
		 * }while(cond);
		 * 
		 * syntax:
		 * do{
		 * 	a+b
		 * }while(a<b);
		 * 
		 * for each loop
		 * for (<datatype> variable_name : collection){
		 * }
		*/
		
		int [] array1 = {10,20,30,40,50,60};
		int j=1;                  
		while(j <= array1.length) {
			j++;
			System.out.println(array1[j]);
		}
		
		
//		for(int i=0; i<array1.length; i++) {
//			System.out.println(i);
//		}
		
		
		
		
		
//		for(int a:array1) {
//			System.out.println(a);
//		}
		
	}

}