package ProgrmmingExamples;

public class ArrayEquilibrium {
    public static int equilibriumNumber(int arr[]) {
	int sum = 0;
	int leftSum = 0;
	for (int n : arr) {
	    sum += n;
	}
	System.out.println("Total sum of Array : " + sum + "");
	for (int i = 0; i < arr.length; i++) {
	    sum -= arr[i];
	    if (leftSum == sum) {
		return i;
	    }
	    leftSum += arr[i];
	}
	return -1;
    }

    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5, 4, 1, 2, 3, 4, 5, 5 };

	System.out.println(equilibriumNumber(arr));

    }

}
