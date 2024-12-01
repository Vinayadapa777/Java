package loops;

public class ForEachLoop {
    public static void main(String[] args) {
	int a[][] = new int[4][4];
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		a[i][j] = (int) (Math.random() * 10);
	    }
	}
	System.out.println("Normal loop");
	for (int i = 0; i <= 3; i++) {
	    for (int j = 0; j <= 3; j++) {
		System.out.print(a[i][j] + " ");
	    }
	    System.out.println();
	}
	System.out.println("For each loop");
	for (int[] n : a) {
	    for (int m : n) {
		System.out.print(m + " ");
	    }
	    System.out.println();
	}
    }
}
