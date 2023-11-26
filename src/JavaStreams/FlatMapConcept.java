package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapConcept {
//The difference between Map and FlatMap
    public static void main(String[] args) {
	// By using map
	List<Integer> listnum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	List<Integer> finallist = listnum.stream().map(n -> n * 5).collect(Collectors.toList());
	System.out.println(finallist);

	// By using Flat by when there are multiple list
	List<Integer> list1 = Arrays.asList(1, 2, 3);
	List<Integer> list2 = Arrays.asList(4, 5, 6);
	List<Integer> list3 = Arrays.asList(7, 8, 9);

	List<List<Integer>> finalResults = Arrays.asList(list1, list2, list3);
	List<Object> results = finalResults.stream().flatMap(x -> x.stream().map(n -> n * 5))
		.collect(Collectors.toList());
	System.out.println(results);

	List<String> team1 = Arrays.asList("Dhoni", "Virat", "Jadeja");
	List<String> team2 = Arrays.asList("Rina", "Bhuvneshwar", "Sachin");
	List<String> team3 = Arrays.asList("RuthuRaj", "Siraj", "Sehawag", "Yuvaraj");

	List<List<String>> players = Arrays.asList(team1, team2, team3);
	List<String> playing11 = players.stream().flatMap(f -> f.stream().map(n -> n)).collect(Collectors.toList());
	System.out.println("Playing eleven :" + playing11);

	List<student> sl1 = new ArrayList<>();
	sl1.add(new student(301, "Vinay", 'A'));
	sl1.add(new student(320, "Ashok", 'B'));
	sl1.add(new student(303, "Adapa", 'C'));

	List<student> sl2 = new ArrayList<>();
	sl2.add(new student(101, "Aksha", 'A'));
	sl2.add(new student(120, "Vihan", 'B'));
	sl2.add(new student(103, "preethi", 'C'));

	List<List<student>> totalStudents = Arrays.asList(sl1, sl2);
	// without streams
	for (List<student> a : totalStudents) {
	    for (student n : a) {
		System.out.print(n.name + " ");
	    }
	}
	List<String> finalnames = totalStudents.stream().flatMap(x -> x.stream().map(n -> n.name))
		.collect(Collectors.toList());

	System.out.println("FinalNames : " + finalnames);
    }

    static class student {
	int roll;
	String name;
	char grade;

	public student(int roll, String name, char grade) {
	    this.roll = roll;
	    this.name = name;
	    this.grade = grade;
	}
    }
}
