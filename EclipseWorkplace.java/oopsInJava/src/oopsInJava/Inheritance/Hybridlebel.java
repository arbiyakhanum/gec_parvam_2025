package oopsInJava.Inheritance;

interface Interfacenew{
	public void display1();
}

class ParentClass2{
	public void display2()
	{
		System.out.println("this is parent class");
	}
}

class ChildClass2 extends ParentClass2 implements Interfacenew{

	@Override
	public void display1() {
		System.out.println("This is Interface");
		
	}
	
}




public class Hybridlebel {

	public static void main(String[] args) {
		ParentClass2 aa=new ParentClass2();
		aa.display2();
		ChildClass2 cc = new ChildClass2();
		cc.display1();
		

	}

}
