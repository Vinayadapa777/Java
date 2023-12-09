package controlstatements;

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {
	System.out.println("Enter age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if (age > 18) {
		System.out.println("Eligible for Vote ");
	} else if (age < 18) {
		System.out.println("Eligible for Vote ");
	} else if (age < 0) {
		System.out.println("Not Born");
	} else {
		System.out.println("invalid age");
	}
}
}
