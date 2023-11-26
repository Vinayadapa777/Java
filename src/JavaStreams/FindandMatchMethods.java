package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindandMatchMethods {

    public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 4, 7, 2, 3, 9, 10, 23, 53, 21, 3, 7);
	List<Integer> sortedAscending = list.stream().sorted().collect(Collectors.toList());
	System.out.println("Ascending List :" + sortedAscending);
	List<Integer> sortedDescending = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("Descending List :" + sortedDescending);

	// Match Method
	Set<String> runs = new HashSet<String>();
	runs.add("one runs");
	runs.add("two runs");
	runs.add("four runs");
	runs.add("one wicket");
	runs.add("two wickets");
	runs.add("three wickets");

	Boolean flag = runs.stream().anyMatch(value -> {
	    return value.startsWith("one");
	});
	System.out.println(flag);// true ,because atleast any element from list start with one

	Boolean flag1 = runs.stream().allMatch(value -> {
	    return value.startsWith("one");
	});
	System.out.println(flag1);// false ,because all elements in the list should starts with one
	Boolean flag2 = runs.stream().noneMatch(value -> {
	    return value.startsWith("one");
	});
	System.out.println(flag1);// false ,because no element in the list should start with one

	// FindMethods
	List<String> listnum = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");

	// FindAny
	Optional<String> ele = listnum.stream().findAny();
	System.out.println("FindAny :" + ele.get());// one or //NosuchElement Exception

	// FindAny
	Optional<String> ele1 = listnum.stream().findAny();
	System.out.println("FindFirst :" + ele1.get());// one or //NosuchElement Exception

	// Combining multiple list
	List<String> animals = Arrays.asList("Tiger", "Lion", "Elephant");
	List<String> birds = Arrays.asList("Peacock", "Parrot", "Crow");

	Stream<String> stream1 = animals.stream();
	Stream<String> stream2 = birds.stream();
	List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
	System.out.println("Combined Stream :"+finalList);
    }

}
