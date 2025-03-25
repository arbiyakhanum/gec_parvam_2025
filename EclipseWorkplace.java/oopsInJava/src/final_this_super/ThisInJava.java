package final_this_super;

class Person {
	public String name;
	public int age;

	// no args
	public Person() {
		System.out.println("Default constructor:");
	}

	// all-args
	public Person(String name, int age) {
		this();
		System.out.println("All args Constructor");
		this.name = name;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public void display() {
		this.sayHello();
		System.out.println("Name is:" + this.name);
		System.out.println("Age is:" + age);
	}
}

public class ThisInJava {

	public static void main(String[] args) {
		Person person = new Person();
		person.sayHello();
		person.display();

	}

}
