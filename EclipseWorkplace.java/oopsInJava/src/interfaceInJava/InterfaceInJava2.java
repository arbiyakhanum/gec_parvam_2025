package interfaceInJava;

interface Interface1{
	public void method();
	public default void defaultMethod() {
		System.out.println("This is deafult method in interface");
	}
	
	public static void staticMethod() {
		System.out.println("This is Static method in interface");
	}

}

class Child1 implements Interface1{

	@Override
	public void method() {
		System.out.println("This is method");
		
	}
	
}

public class InterfaceInJava2 {

	public static void main(String[] args) {
		
		Child1 child=new Child1();
		child.method();
		child.defaultMethod();
		Interface1.staticMethod(); //the static method should be called using the interface name not the class name.
	}

}
