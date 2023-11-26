package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DifferentStreamMethods {
//Here we are going to learn 
//DISTINCT ,cOUNT,lIMIT,REDUCE.ToArray
//Above methods also called as NonTerminal methods
//We can use all the nonterminal methods after map or filter     
    public static void main(String[] args) {
	List<String> vehicles = Arrays.asList("Car", "Bike", "Train", "Bycle", "van", "Bus", "Car", "Bike", "Train");
	System.out.println("Printing all vehicles :" + vehicles);

	// Distinct Method
	List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
	System.out.println("Distinct Vehicles :" + distinctVehicles);

	// Count
	long count = vehicles.stream().count();
	System.out.println("Count of all vehicles :" + count);// 9
	long count1 = distinctVehicles.stream().count();
	System.out.println("Count of Distinct Vehicles :" + count1);// 6

	// Limt Method
	List<String> limitedVehicles = vehicles.stream().limit(3).collect(Collectors.toList());
	System.out.println("Limited Vehicles :" + limitedVehicles);// [Car, Bike, Train]

	// count even numbers in list
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
	long evennumbers = numbers.stream().filter(n -> n % 2 == 0).count();
	System.out.println("Count of even nubers in a List :" + evennumbers);// 5

	// min
	Optional<Integer> minnumber = numbers.stream().min((val1, val2) -> {
	    return val1.compareTo(val2);
	});
	System.out.println("Minimum number in a list :" + minnumber.get());// 1

	// max
	Optional<Integer> maxnumber = numbers.stream().max((v1, v2) -> {
	    return v1.compareTo(v2);
	});
	System.out.println("Maximum number in the list :" + maxnumber.get());// 11

	// reduce method
	List<String> stlist = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
	Optional<String> reduce = stlist.stream().reduce((val1, combinedvalues) -> {
	    return combinedvalues + val1;
	});
	System.out.println("Printing reduced list :"+reduce.get());
	
	//ToArray method
	List<String> stlist1 = Arrays.asList("A", "B", "C", "D", "1", "2", "3");
	Object arr[]=stlist1.stream().toArray();
	for(Object t:arr) {
	    System.out.print(t +" ");
	}
    }

}
