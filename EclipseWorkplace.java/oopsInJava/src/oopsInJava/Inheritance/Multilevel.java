package oopsInJava.Inheritance;
class grandparentClass{
	public void grandparentmethod()
	{
		System.out.println("this is grand parent method");
	}
}

class ParentClass extends grandparentClass{
	public void parentmethod() {
		System.out.println("this is parent method");
	}
}

class childclass extends ParentClass{
	public void childmethod() {
		System.out.println("this is child class");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		grandparentClass gc=new grandparentClass();
		gc.grandparentmethod();
		
		System.out.println("-----------------------------");
		
		ParentClass pc=new ParentClass();
		pc.grandparentmethod();
		pc.parentmethod();
		
		System.out.println("-----------------------------");
		
		childclass cc=new childclass();
		cc.grandparentmethod();
		cc.parentmethod();
		cc.childmethod();
		
		
		
	}

}
