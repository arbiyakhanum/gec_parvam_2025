package functionsinjava.functions;

public class Functionsinjava1 {
	
	//1. public function:
	//scope -> anywhere
	public void publicFunction() {
		System.out.println("This is public function");
		
	}
	
	//2. private function
	//->within class
	private void PrivateFunction() {
		System.out.println("This is Private function");
	}
	
	//3. default function
	//within the package
	void defaultFunction() {
		System.out.println("This is default function");
	}
	
	//4 protected function
	//within package and subclass in other package
	
	protected void ProtectedFunction() {
		System.out.println("This is protected function");
		
	}
	
	//5. static function
	//we can access by using class name
	private static void staticFunction() {
		System.out.println("This is static function");
	
	}

	public static void main(String[] args) {
		
	Functionsinjava1 obj1=new Functionsinjava1();
	obj1.PrivateFunction();
	obj1.publicFunction();
	obj1.ProtectedFunction();
	Functionsinjava1.staticFunction();

	}

	

}
