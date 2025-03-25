package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("Parent class constructor");
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name:" +this.name);
		System.out.println("Age:" +this.age);
	}
}

class NewDog extends NewAnimal{
	public String eat;

	public NewDog(String name, int age, String eat) {
		super(name, age);
		System.out.println("Child class constructor");
		this.eat = eat;
	}
	
	public void  display() {
		super.display();
		System.out.println("Dog eats:" +this.eat);
		System.out.println("Name of the dog once again:" +super.name);
	}	
}

public class SuperInJava {

	public static void main(String[] args) {
		/*
		 * Super:
		 * 1. it is used to call super class instance variable
		 * 2. it is used to call super class constructor
		 * 3. it is used to call super class methodss
		 * 
		 */
		NewAnimal newAnimal= new NewAnimal("cat", 6);
		newAnimal.display();
		
		NewDog newdog= new NewDog("cat", 6,"Dog eats");
		newdog.display();

	}

}
