package ProgrmmingExamples;

public class SmallestInArrya {
    // Find the Smallest number in the given array
    public static int smmalestInArray(int arr[]) {
	int smallest = Integer.MAX_VALUE;
	for (int n : arr) {
	    if (n < smallest) {
		smallest = n;
	    }
	}
	return smallest;
    }

    public static void main(String[] args) {
	int arr[] = { 8, 3, 2, 4, 6, 8, 9, 12, 45, 67, 879, 678, 90, -67, 345, 45 };
	System.out.println("Smallest Number in Array : " + smmalestInArray(arr));
    }

}
