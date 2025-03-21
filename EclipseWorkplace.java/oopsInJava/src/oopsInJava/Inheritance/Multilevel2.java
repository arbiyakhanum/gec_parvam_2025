package oopsInJava.Inheritance;

class grandparentClass1{
	public void grandparentmethod1()
	{
		System.out.println("this is grand parent method");
	}
}

class ParentClass1 extends grandparentClass1{
	public void parentmethod1() {
		System.out.println("this is parent method");
	}
}
class ChildClass1 extends grandparentClass1{
	public void childmethod1() {
		System.out.println("this is child method");
	}
}

public class Multilevel2 {

	public static void main(String[] args) {
		grandparentClass1 gc=new grandparentClass1();
		gc.grandparentmethod1();
		
		System.out.println("-----------------------------");
		
		ParentClass1 pc=new ParentClass1();
		pc.parentmethod1();
		
		System.out.println("-----------------------------");
		
		ChildClass1 cc=new ChildClass1();
		cc.childmethod1();
		
		
		

	}

}
