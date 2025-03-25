package concreteClass;

class Student {
	// private fields
	private String name;
	private int age;

	
	//no-args constructor	
	public Student() {
		super();
	}
	
	
	//all-args constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Getters and setters
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

	@Override
	public String toString() {
		 return "Student[name=" + name + ", age=" + age + "]";
	}

}

public class PojoClass {

	
	public static void main(String[] args) {
	/*
	 * POJO Class:
	 * Plain old java object(POJO)
	 * 
	 * rules:
	 * 1. The class is should not extends or implements any class or interface
	 * 2. Every fields (states/properties) should be private 
	 * 3. All-args Constructor
	 * 4. No-args Constructor
	 * 5. toString()
	 * 6. Getter ans setter public methods
	 */
		
		
		// Using No-args Constructor
		Student student =new Student();
		student.setName("Bushra Firdose");
		student.setAge(22);
		
		// Using All-args Constructor
		Student student1 = new Student("Jane Doe", 30);
		
		// Printing the objects using toString()
        System.out.println(student);
        System.out.println(student1);
	}

}
