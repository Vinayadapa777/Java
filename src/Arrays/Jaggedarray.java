package Arrays;

public class Jaggedarray {

    public static void main(String[] args) {
	int a[][] = new int[3][];
	a[0] = new int[8];
	a[1] = new int[7];
	a[2] = new int[5];
	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a[i].length; j++) {
		a[i][j] = (int) (Math.random() * 10);
	    }
	}

	for (int[] n : a) {
	    for (int m : n) {
		System.out.print(m + " ");
	    }
	    System.out.println();
	}
    }
}
