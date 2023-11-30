package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueNumbersInArray {

    // Print the unique and repeated/Duplicates values
    public static void uniqueNumbers(int arr[]) {
	List<Integer> listOfNum = new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
	    if (!listOfNum.contains(arr[i])) {
		int count = 1;
		listOfNum.add(arr[i]);
		for (int j = i + 1; j < arr.length; j++) {
		    if (arr[i] == arr[j]) {
			count++;
		    }
		}
		if (count == 1) {
		    System.out.println(arr[i] + " unique Element in Array ");
		}
		if (count > 1) {
		    System.out.println(arr[i] + " repeated " + count + " times");
		}
	    }
	}
    }

    public static void main(String[] args) {
	int arr[] = { 2, 3, 4, 5, 6, 7, 1, 9, 3, 2, 4, 5, 2, 4, 3, 2 };
	uniqueNumbers(arr);
    }

}
