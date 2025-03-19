package introduction_to_java.firstprogram;

public class Switch2 {

   

	public static void main(String[] args) {
        String obj1 = "hello";  // Changed Object to String

        switch (obj1) {
            case String d -> System.out.println("string type" +d);
            default -> System.out.println("invalid");
        }
    }
}
