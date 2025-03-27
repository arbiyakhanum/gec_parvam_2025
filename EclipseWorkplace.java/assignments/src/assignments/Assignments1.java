package assignments;

public class Assignments1 {
	String name;
	double marks;

	public Assignments1(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}

	public static void main(String[] args) {

		Assignments1 stud = new Assignments1("arbiya", 91.87);
		stud.displayDetails();

	}
}
