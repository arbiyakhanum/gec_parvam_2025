package exceptionInjava;

public class ExceptionInjava2 {

	public static void main(String[] args) {
		/*
		 * try with multiple catch
		 */

		int[] arr = new int[2];
		arr[0] = 30;
		arr[1] = 50;

		try {
			System.out.println(arr[10]);
			System.out.println(10 / 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}System.out.println("Hello World");

	}

}
