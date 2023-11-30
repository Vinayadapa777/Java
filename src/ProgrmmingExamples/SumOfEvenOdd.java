package ProgrmmingExamples;

public class SumOfEvenOdd {
    // Add all the Even Numbers in the array
    public int sumOfEven(int arr[]) {
	int evenSum = 0;
	for (int n : arr) {
	    if (n % 2 == 0) {
		evenSum += n;
	    }
	}
	return evenSum;
    }

    // All all the odd numbers in the array
    public int sumOfOdd(int arr[]) {
	int OddSum = 0;
	for (int n : arr) {
	    if (n % 2 != 0) {
		OddSum += n;
	    }
	}
	return OddSum;
    }

    public static void main(String[] args) {
	int array[] = { 8, 323, 6, 33, 5, 5, 6, 2, 5, 7, 6, 22, 9, 7 };
	SumOfEvenOdd l = new SumOfEvenOdd();
	System.out.println("Sum of the Even Numbers in Array :" + l.sumOfEven(array));
	System.out.println("Sum of the Odd Numbers in Array :" + l.sumOfOdd(array));

    }

}
