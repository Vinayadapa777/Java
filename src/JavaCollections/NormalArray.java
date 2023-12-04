package JavaCollections;

public class NormalArray {

    public static void main(String[] args) {
	int a[] = new int[5];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 4;
	a[4] = 5;
	System.out.println(a);//[I@626b2d4a
	int b[] = { 1, 2, 3, 4, 5, 6, 7 };
	System.out.println("Printing Array a");
	for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println();
	System.out.println("Printing Array b");
	for (int i = 0; i < a.length; i++) {
	    System.out.print(b[i] + " ");
	}
	System.out.println();
	System.out.println("using for each loop");
	for (int i : b) {
	    System.out.print(i + " ");
	}
    }
}
