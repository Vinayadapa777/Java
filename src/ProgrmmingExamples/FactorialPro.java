package ProgrmmingExamples;

public class FactorialPro {
    public static int recFact(int n) {
	if (n == 0 || n == 1) {
	    return n;
	} else {
	    return (n * (recFact(n - 1)));
	}
    }

    public static int fact(int n) {
	int fact = 1;
	for (int i = 1; i <= n; i++) {
	    fact = fact * i;
	}
	return fact;
    }

    public static void main(String[] args) {
	System.out.println(recFact(6));
	System.out.println(fact(6));

    }

}
