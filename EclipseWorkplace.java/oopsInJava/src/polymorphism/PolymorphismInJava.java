package polymorphism;

//1. method-ovreriding
class Person {
	public void walking() {
		System.out.println("The person is walking");
	}
}

class Mohid extends Person {
	public void walking() {
		System.out.println("Mohid is walking");
	}

}

//2. method-overloading
class Addition {
	public static void add(int a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("Addition is :" + (a + b + c));
	}
}

public class PolymorphismInJava {
	public static void main(String[] args) {

		/*
		 * Polymorphism: poly -many morphism - forms It is a mechanism that methods will
		 * perform a different action based on the situation
		 * 
		 * 1.method-overloading(one class) 2.method-overriding(two class)
		 * 
		 */

		// 1. method-ovreriding/dynamic polymorphism /runtime polymorphism
		Person person = new Person();
		person.walking();

		Mohid mohid = new Mohid();
		mohid.walking();

		// 2. method-overloading/complile time polymorphism /static time binding
		Addition addition = new Addition();
		addition.add(90, 100);
		addition.add(50, 20, 5);
		
		

	}

}
