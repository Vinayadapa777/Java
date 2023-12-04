package JavaCollections;

import java.util.TreeMap;

public class Treemap {
//  1.Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//  2.Java TreeMap contains only unique elements.
//  3.Java TreeMap cannot have a null key but can have multiple null values.
//  4.Java TreeMap is non synchronized.
//  5.Java TreeMap maintains ascending order.
    public static void main(String[] args) {
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	map.put(100, "Amit");
	map.put(102, "Ravi");
	map.put(101, "Vijay");
	map.put(103, "Rahul");
	System.out.println(map); // {100=Amit, 101=Vijay, 102=Ravi, 103=Rahul}
//	System.out.println(map.remove(101));// Vijay
	System.out.println(map);// {100=Amit, 102=Ravi, 103=Rahul}
	// Maintains descending order
	System.out.println("descendingMap: " + map.descendingMap());// descendingMap: {103=Rahul, 102=Ravi, 101=Vijay,
								    // 100=Amit}
	// Returns key-value pairs whose keys are less than or equal to the specified
	// key.
	System.out.println("headMap: " + map.headMap(102, true)); // headMap: {100=Amit, 101=Vijay, 102=Ravi}
	// Returns key-value pairs whose keys are greater than or equal to the specified
	// key.
	System.out.println("tailMap: " + map.tailMap(102, true)); // tailMap: {102=Ravi, 103=Rahul}
	// Returns key-value pairs exists in between the specified key.
	System.out.println("subMap: " + map.subMap(100, false, 102, true)); // subMap: {101=Vijay, 102=Ravi}
    }
}
