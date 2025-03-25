package oopsInJava.Inheritance;

interface I1 {
    public void methodI1();
}

interface I2 {
    public void methodI2();
}

class P extends C2 implements I1, I2  {

    @Override
    public void methodI1() {
        System.out.println("This is method from Interface I1");
    }

    @Override
    public void methodI2() {
        System.out.println("This is method from Interface I2");
    }

    public void displayC1() {
        System.out.println("This is Class C");
    }
    
    public void displayP() {
        System.out.println("This is Class P");
    }
}



    

public class Assignment2 {
    public static void main(String[] args) {
        P obj = new P();
        obj.methodI1();
        obj.methodI2();
        obj.displayC1();
        obj.displayP();
    }
}
