package Arrays;

import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {
	// int a[][]= {{1,2,3,},{11,22,33},{111,222,333}};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows that you required");
	int x = sc.nextInt();
	System.out.println("Enter number of columns that you required");
	int y = sc.nextInt();
	int a[][] = new int[x][y];
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		a[i][j] = (int) (Math.random() * 10);
	    }
	}

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
	// by using enhanced for loop
//	for (int[] n : a) {
//	    for (int m : n) {
//		System.out.print(m + " ");
//	    }
//	    System.out.println();
//	}

    }
}
