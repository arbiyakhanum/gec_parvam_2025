package oopsInJava.Inheritance;

interface I11 {
    public void methodI11();
}

interface I22 {
    public void methodI22();
}

interface I33 extends I11, I22 {
    public void methodI33();
}

class I implements I33 {

    @Override
    public void methodI11() {
        System.out.println("This is method from Interface I11");
    }

    @Override
    public void methodI22() {
        System.out.println("This is method from Interface I22");
    }

    @Override
    public void methodI33() {
        System.out.println("This is method from Interface I33");
    }

    public void displayC1() {
        System.out.println("This is Class I");
    }
}

class C2 extends I {
    public void displayC2() {
        System.out.println("This is Class C2");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        I obj1 = new I(); 
        obj1.methodI11();
        obj1.methodI22();
        obj1.methodI33();
        obj1.displayC1();

        C2 obj2 = new C2(); 
        obj2.methodI11();
        obj2.methodI22();
        obj2.methodI33();
        obj2.displayC2();
    }
}
