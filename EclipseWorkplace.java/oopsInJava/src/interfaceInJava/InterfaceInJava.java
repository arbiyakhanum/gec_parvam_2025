package interfaceInJava;


interface Animal{
		public void makesound();
	}
	
	class Dog implements Animal{

		@Override
		public void makesound() {
			System.out.println("Dog Barks");
			
		}
	}
	class Cat implements Animal{

		@Override
		public void makesound() {
			System.out.println("Meow Meow");
			
		}
			
		}
		
		
	
public class InterfaceInJava {
	public static void main(String[] args) {
		
		
		/* Interface:
		 * It is a blue print of the class
		 * The method in the interface by default abstract(does not contain)
		 * from java 8 we can write default and static method in interface
		 * 
		 * 
		 * interface interface_name{
		 * code
		 * }
		 * 
		 * interface Animal{
		 * public void makeSound();
		 * }
		 * 
		 */
		
		Dog dog = new Dog();
		dog.makesound();
		Cat cat = new Cat();
		cat.makesound();
		
		

	}

}
