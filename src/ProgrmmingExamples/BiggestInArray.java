package ProgrmmingExamples;

public class BiggestInArray {
    // Find the Biggest Number in the given array
    public static int BiggestArray(int arr[]) {
	int biggestNumber = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] > biggestNumber) {
		biggestNumber = arr[i];
	    }
	}
	return biggestNumber;
    }

    public static void main(String[] args) {
	int arr[] = { 8, 3, 2, 4, 6, 8, 9, 12, 45, 67, 879, 678, 90, 2, 345, 45 };
	System.out.println("Biggest Number in Array : " + BiggestArray(arr));
    }

}
