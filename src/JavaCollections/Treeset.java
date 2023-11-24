package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
//  1.Java TreeSet class contains unique elements only like HashSet.
//  2.Java TreeSet class access and retrieval times are quiet fast.
//  3.Java TreeSet class doesn't allow null element.
//  4.Java TreeSet class is non synchronized.
//  5.Java TreeSet class maintains ascending order.
//  6.Java TreeSet class contains unique elements only like HashSet.
//  7.Java TreeSet class access and retrieval times are quite fast.
//  8.Java TreeSet class doesn't allow null elements.
//  9.Java TreeSet class is non-synchronized.
//  10.Java TreeSet class maintains ascending order.
//  11.The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.
    public static void main(String[] args) {
	TreeSet<String> al = new TreeSet<String>();
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ravi");
	al.add("Ajay");
	System.out.println(al);// [Ajay, Ravi, Vijay]
	Iterator i = al.descendingIterator();
	while (i.hasNext()) {
	    System.out.print(i.next() + " "); // Vijay Ravi Ajay
	}
	TreeSet<Integer> set = new TreeSet<Integer>();
	set.add(24);
	set.add(66);
	set.add(12);
	set.add(15);
	System.out.println();
	// first and last method return elements accordingly
	System.out.println("First element :" + set.first() + " & Last Element :" + set.last());// First element :12 &
											       // Last Element :66
	// poll will return and remove the element at top
	System.out.println("Lowest Value: " + set.pollFirst());// 12
	System.out.println("Highest Value: " + set.pollLast());// 66

	TreeSet<String> set1 = new TreeSet<String>();
	set1.add("A");
	set1.add("B");
	set1.add("C");
	set1.add("D");
	set1.add("E");
	System.out.println("Initial Set: " + set1);
	System.out.println("Reverse Set: " + set1.descendingSet());
	System.out.println("Head Set: " + set1.headSet("C", true));//remove the element after C and make till C as Head
	System.out.println("SubSet: " + set1.subSet("A", false, "E", true));//[B, C, D, E]
	System.out.println("TailSet: " + set1.tailSet("C", false));//[D, E]

    }

}
