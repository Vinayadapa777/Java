package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceInTwoArray {
    public static void diffInArrays(int arr1[], int arr2[]) {

	List<Object> finallist = new ArrayList<>();

	for (int i : arr1) {
	    if (!isContains(arr2, i)) {
		finallist.add(i);
	    }
	}
	for (int j : arr2) {
	    if (!isContains(arr1, j)) {
		finallist.add(j);
	    }
	}
	System.out.println(finallist);

    }

    public static boolean isContains(int arr[], int value) {
	for (int a : arr) {
	    if (a == value) {
		return true;
	    }
	}
	return false;
    }

    public static void main(String[] args) {
	int arr1[] = { 1, 2, 3, 4, 4 };
	int arr2[] = { 0, 1, 2, 5,4,4, 7 };
	diffInArrays(arr1, arr2);
    }

}
