package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceInTwoArray {
    public static void diffInArrays(int arr1[], int arr2[]) {

	ArrayList<Object> list = new ArrayList<>();

	for (int n : arr1) {
	    if (!isContains(n, arr2)) {
		list.add(n);
	    }
	}
	for (int n : arr2) {
	    if (!isContains(n, arr1)) {
		list.add(n);
	    }
	}

	System.out.println(list);
    }

    public static boolean isContains(int value, int arr[]) {
	for (int n : arr) {
	    if (n == value)
		return true;
	}
	return false;
    }

    public static void main(String[] args) {
	int arr1[] = { 1, 2, 3, 4, 4 };
	int arr2[] = { 0, 1, 2, 5, 4, 4, 7 };
	diffInArrays(arr1, arr2);
    }

}
