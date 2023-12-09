package ProgrmmingExamples;

import java.util.*;

public class Combinatios {
    public static void main(String[] args) {
	int[] input = { 1, 2, 3 };
	int i = 0;
	List<String> combinations = new ArrayList<>();
	HashSet<Integer> finalList = new HashSet<>();
	generateCombinations(input, "", 0, combinations);
	for (String combination : combinations) {
	    if (combination != "")
		i = Integer.parseInt(combination);
	    finalList.add(i);
	    System.out.println(i);
	}

	System.out.println("Size of the Combinations : " + finalList.size());
	System.out.println("Before Sorting : " + finalList);
	List<Integer> results = new ArrayList<>(finalList);
	Collections.sort(results);
	System.out.println("Final Result : " + results);
    }
    public static void generateCombinations(int[] input, String current, int index, List<String> combinations) {
	if (index == input.length) {
	    combinations.add(current);
	    return;
	}
	generateCombinations(input, current + input[index], index + 1, combinations);
	generateCombinations(input, current, index + 1, combinations);
    }
}
