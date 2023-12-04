package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapConcept {
//1.in Map we are manipulating the data using the MAP
    public static void main(String[] args) {
	List<String> animals = Arrays.asList("tiger", "monkey", "lion", "elephant", "bat", "dog");
	List<String> animalsUpperCasen = new ArrayList<>();
	List<String> animalsUpperCase = new ArrayList<>();
	// Achieving our Goal using normal loop
	for (String a : animals) {
	    animalsUpperCasen.add(a.toUpperCase());
	}
	System.out.println("animalsUpperCase using normal loop:" + animalsUpperCasen);

	animalsUpperCase = animals.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
	System.out.println("animalsUpperCase using MAP:" + animalsUpperCase);
	List<String> vehicles = Arrays.asList("Car", "Bicycle", "Bus", "Lorry", "MotorCycle");
	List<String> MapedVehicles = new ArrayList<>();
	// without Using Streams
	for (String v : vehicles) {
	    System.out.print(v.length() + ",");
	}
	// Using Stream
	System.out.println();
	System.out.println("using streams getting length of each String");
	vehicles.stream().map(n -> n.length()).forEach(s -> System.out.print(s+" "));

	List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer> mutipliedNum = new ArrayList<>();
	// goal=3,6,9,12,15,18,21,24,27,30
	// With out using streams
	System.out.println("Multiplied numbers withou using streams");
	for (int n : num) {
	    System.out.print(n * 3 + " ");// 3 6 9 12 15 18 21 24 27 30
	}
	System.out.println();
	mutipliedNum = num.stream().map(n -> n * 3).collect(Collectors.toList());
	System.out.println("Multplied numbers using streams :" + mutipliedNum);

	List<employee> emp = Arrays.asList(new employee(301, "Vinay", 100000), new employee(302, "Ashok", 99999),
		new employee(303, "Vihan", 30000), new employee(304, "Aksha", 50000));
	List<Object> empsal = emp.stream().filter(n -> n.salary > 25000).map(e -> e.salary)
		.collect(Collectors.toList());
	System.out.println("Filtered with salary> 25k & printing only salary :" + empsal);
    }

    static class employee {
	int id;
	String name;
	int salary;

	public employee(int id, String name, int salary) {
	    this.id = id;
	    this.name = name;
	    this.salary = salary;
	}
    }
}
