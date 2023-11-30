package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingArray {
    // Sort the given array in the smallest number to Biggest Number
    public static void sortAscending(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] > arr[j]) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}
	System.out.println("Ascending order Array :" + Arrays.toString(arr));
    }

    // Sort the Given array from biggest to smallest numbers
    public static void sortDescending(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] < arr[j]) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}
	System.out.println("Descending order Array :" + Arrays.toString(arr));
    }

    public static void mapSorting() {
	// Sorting Map
	Map<String, Integer> scores = new HashMap<>();
	scores.put("David", 95);
	scores.put("Jane", 80);
	scores.put("Mary", 97);
	scores.put("Lisa", 78);
	scores.put("Dino", 65);
	scores.put("Mary", 97);

	Set<Entry<String, Integer>> set = scores.entrySet();
	System.out.println(set);
	List<Entry<String, Integer>> al = new ArrayList<>(set);
	al.sort((x, y) -> x.getValue().compareTo(y.getValue()));
	System.out.println(al);

    }

    public static void main(String[] args) {
	int arr[] = { 8, 3, 2, 4, 6, 8, 9, 1112, 45, 67, 879, 678, 90, 2, 345, 45 };
	sortAscending(arr);
	sortDescending(arr);
	mapSorting();
    }

}
