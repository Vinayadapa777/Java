package ProgrmmingExamples;

public class FibnocciPro {

    public static void fibnocci(int n) {
	int a = 0;
	int b = 1;
	System.out.print(a + " " + b);
	int i = 0;
	while (i < n - 2) {//because previously we have printing 2 values so using -2 to get exact count
	    int c = a + b;
	    a = b;
	    b = c;
	    System.out.print(" " + c);
	    i++;
	}

    }

    public static int fr(int n) {
	if (n == 0 || n == 1) {
	    return n;
	}
	return (fr(n - 2) + fr(n - 1));

    }

    public static void fibnoccirecc(int n) {
//	for (int i = 0; i < n; i++) {
//	    System.out.print(fr(i) + " ");
//	   
//	}
	 System.out.println(fr(6));
    }

    public static void main(String[] args) {
	fibnocci(20);
	System.out.println();
	fibnoccirecc(20);
    }

}
