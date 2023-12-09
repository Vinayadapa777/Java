package keywords;

public class StaticMethod {
    public static void example() {
	System.out.println("Static method called without object creation");
    }

    public static void main(String[] args) {
	// When we have static method we can directly call the method to run without
	// object Creation
	example();
    }

}
