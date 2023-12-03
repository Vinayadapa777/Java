package ProgrmmingExamples;

public class MissingInSortedArray {

    public static int missingArray(int arr[]) {
	int n = arr.length + 1;
	int expected = (n * (n + 1) / 2);
	int actual = 0;
	for (int e : arr) {
	    actual += e;
	}
	return expected - actual;
    }

    public static void main(String[] args) {
	int arr[] = { 4, 5, 2, 6, 10, 7, 8, 3, 9 };
	System.out.println("Missing number in sequence array :" + missingArray(arr));
    }

}
