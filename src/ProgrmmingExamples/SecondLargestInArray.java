package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestInArray {

    public static int secondBiggestNum(int arr[]) {
	int firtBiggest = Integer.MIN_VALUE;
	int secondBiggest = Integer.MIN_VALUE;
	for (int n : arr) {
	    if (n > firtBiggest) {
		secondBiggest = firtBiggest;
		firtBiggest = n;
	    } else if (n > secondBiggest) {
		secondBiggest = n;
	    }
	}
	return secondBiggest;
    }

    public static void sortmethod(int arr[]) {
	ArrayList<Integer> list = new ArrayList<>();
	for (int n : arr) {
	    list.add(n);
	}
	System.out.println(list);
	int index = list.size() - 2;
	Collections.sort(list);
	System.out.println(list.get(index));

    }

    public static void main(String[] args) {
	int arr[] = { 1, 3, 5, 8, 6, 4, 6, 7, 23, 8, 3, 56, 8, 22, 7 };
	// System.out.println(secondHig(arr));
	System.out.println(secondBiggestNum(arr));
	sortmethod(arr);
    }

}
