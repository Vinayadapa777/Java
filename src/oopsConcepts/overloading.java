package oopsConcepts;

public class overloading {

    public void add(int a, int b) {
	System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
	System.out.println(a + b + c);
    }

    public void add(double n1, double n2) {
	System.out.println(n1 + n2 + " : Double method");
    }

    public void add(int a, String b) {
	System.out.println(a + ": " + b);
    }

    public void add(String a, int b) {
	System.out.println(a + ": " + b);
    }

    public static void main(String[] args) {
	overloading ov = new overloading();
	ov.add(10, 20);
	ov.add(2.9993, 3.5323);
	ov.add(10, 20, 30);
	ov.add("Vinay", 70);
	ov.add(7, "Ashok");

    }

}
