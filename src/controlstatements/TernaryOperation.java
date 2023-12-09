package controlstatements;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
	System.out.println("Enter age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	String result = (age > 18) ? "Eligible for vote" : "Not Eligible for Vote";
	System.out.println(result);
	boolean res=(age>18)?true:false;
	System.out.println(res);
}
}
