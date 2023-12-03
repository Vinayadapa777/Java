package ProgrmmingExamples;

public class ArrayEquilibrium {
    public static int equilibriumNumber(int arr[]) {
	int sum = 0;
	int leftSum = 0;
	int n = arr.length;
	for (int m : arr) {
	    sum += m;
	}
	System.out.println("Total Sum :" + sum);
	for (int i = 0; i < n; i++) {
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
