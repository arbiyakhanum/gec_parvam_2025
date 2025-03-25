package abstraction;

//1. interface
interface Animal {
	public void eat();

}

class Lion implements Animal {
	@Override
	public void eat() {
		System.out.println("Lion will eat Chicken");
	}

}

//2. abstract class

abstract class Vehicle {
	// abm
	public abstract void start();

	// non-abm
	public void stop() {
		System.out.println("The vehicle is stopped");
	}
}

	class Car extends Vehicle {

		@Override
		public void start() {
			System.out.println("The car Starts");

		}
	}

	public class Abstraction {

		public static void main(String[] args) {
			/*
			 * Abstraction: It is a process of hiding the implementation and showing only
			 * the essential resources
			 * 
			 * 2 ways: 
			 *  1. Interface(100%) 
			 * 2. abstract class (0-100%)-- cannnot create object
			 */

			// 1. Interface
			Lion lion = new Lion();
			lion.eat();

			// 2. abstract class
			Car car = new Car();
			car.start();
			car.stop();
		}
	
}
