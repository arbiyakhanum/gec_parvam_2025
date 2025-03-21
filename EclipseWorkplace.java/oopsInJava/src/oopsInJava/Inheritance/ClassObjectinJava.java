package oopsInJava.Inheritance;

class Student{
	//states
	public int age=21;
	public String name="Habiba ";
	public double marks=95.89;
	
	//actions
	public void isPlaying() {
		System.out.println(this.name + "is Dancing");
	}
	
	public void isSleeping() {
		System.out.println(this.name + "is Singing");
	}
	
	
}
	

public class ClassObjectinJava {
	

	public static void main(String[] args) {

		
		/*---------------------------------------------
		 * class:
		 * Class will represent the state and behavior of an object
		 * state -> property
		 * behavior ->action
		 * 
		 * we can only assign 2 access modifiers to class ->public and bydefault
		 * 
		 * ---------------------------------------------
		 * object:
		 * Object is a implementation of class(state and action)
		 * 
		 * example:Student
		 * ---------------------------------------------
		 * 
		 * property:
		 * USN
		 * Name
		 * Branch
		 * Age
		 * ---------------------------------------------
		 * 
		 * action:
		 * isplaying()
		 * isintershiping()
		 * 
		 * ---------------------------------------------
		 * 
		 * How to declare class and object:
		 * 
		 * class class_name{
		 *  state
		 *  action
		 *  }
		 *  
		 *  ---------------------------------------------
		 *  example:
		 *  
		 *  class Student{
		 *  	property:
		 *  	public int age =30;
		 *  
		 *  	action:
		 * 		public void idPlaying(){
		 * 		syso("The student is playing")
		 * 		}
		 * }
		 * Student std1 = new Student();
		 */
	
		
	Student std1= new Student();
	System.out.println(std1.age);
	System.out.println(std1.name);
	System.out.println(std1.marks);
	std1.isPlaying();
	std1.isSleeping();
	}
}
