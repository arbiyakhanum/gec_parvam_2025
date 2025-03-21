package interfaceInJava;


interface A{
	public void methodA();
}


interface B{
	public void methodB();
}

//for same method

interface C{
	public void method();
}


interface D{
	public void method();
}

class Child implements A,B,C,D{

	@Override
	public void methodB() {
		System.out.println("This is method B");
		
	}

	@Override
	public void methodA() {
		System.out.println("This is method A");
		
	}

	@Override
	public void method() {
		System.out.println("This is method from C and D");
		
	}
	
}

public class InterfaceInJava1 {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.methodA();
		child.methodB();
		child.method();
		

	}

}
