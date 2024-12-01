package loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
	System.out.println("Enter number of count");
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	int i = 0;
	
	while (i <= count) {
		System.out.println("Hi" + i);
		int j = 1;
		while (j <= 3) {
			System.out.println("Inner Hi");
			j++;
		}
		i++;
	}

}

}
