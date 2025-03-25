package encapsulation;

class Student {
	private String name;
	private int age;
	private double marks;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class EncapsulationInJava {

	public static void main(String[] args) {
		
		Student std2=new Student();
		std2.setName("Arbiya");
		System.out.println(std2.getName());
		
	}
		

	}


