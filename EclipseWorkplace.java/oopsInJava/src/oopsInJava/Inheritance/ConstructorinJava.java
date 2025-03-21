package oopsInJava.Inheritance;

//constructor- used to assign values to instance variables

class Student1 {
	// states
	public int age = 21;
	public String name = "Habiba ";
	public double marks = 95.89;

	// full args constructor
	

	public Student1(int age, String name, double marks) {
		System.out.println("Full args Constructor");
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	
	

	
	public Student1() {
		System.out.println("No args constructor");
	}




	// actions
	public void isPlaying() {
		System.out.println(this.name + "is Dancing");
	}

	public void isSleeping() {
		System.out.println(this.name + "is Singing");
	}

	public void display() {

		System.out.println("Name:" + this.name);
		System.out.println("Age:" + this.age);
		System.out.println("Marks:" + this.marks);

	}

}

public class ConstructorinJava {
	public static void main(String[] args) {
		
		Student1 std1=new Student1(12, "bushra", 3823.3276);
		std1.display();
		Student1 std2= new Student1();
		std2.display();

	}

}
