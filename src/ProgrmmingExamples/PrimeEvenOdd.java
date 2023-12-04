package ProgrmmingExamples;

public class PrimeEvenOdd {
    public static void isEven(int n) {
	System.out.println((n % 2 == 0) ? "Yes its a Even Number" : "No its not a Even Number");
    }

    public static void isOdd(int n) {
	System.out.println((n % 2 != 0) ? "Yes its a odd Number" : "No its not a Odd Number");
    }

    public static boolean isPrime(int n) {
	if (n == 0 || n == 1) {
	    System.out.println("No its not a Prime number");
	}
	for (int i = 2; i <=n/2 ; i++) {
	    if (n % i == 0) {
		return false;
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	isEven(8);
	isEven(7);
	isOdd(9);
	isOdd(8);
	System.out.println(isPrime(7));

    }

}
