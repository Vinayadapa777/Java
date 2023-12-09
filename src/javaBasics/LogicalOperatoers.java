package javaBasics;

public class LogicalOperatoers {
    public static void main(String args[]) {
	int a = 10, b = 34;
	double x = 3.9, y = 23.0;

	boolean result = a < b && x > y;
	System.out.println(result);

	boolean result1 = a < b && x < y;
	System.out.println(result1);

	boolean result2 = a > b || x > y;
	System.out.println(result2);

	boolean result3 = a > b || x < y;
	System.out.println(result3);
    }
}
