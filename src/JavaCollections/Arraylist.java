package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
//1.  Java ArrayList class can contain duplicate elements.
//2.  Java ArrayList class maintains insertion order.
//3.  Java ArrayList class is non synchronized.
//4.  Java ArrayList allows random access because the array works on an index basis.
//5.  In ArrayList, manipulation is a little bit slower than the LinkedList in Java
//    because a lot of shifting needs to occur if any element is removed from the array list.
//5.  We can not create an array list of the primitive types, such as int, float, char, etc. 
//    It is required to use the required wrapper class in such cases. For
//6.  Java ArrayList gets initialized by the size. The size is dynamic in the array list,
//    which varies according to the elements getting added or removed from the list.    
    public static void main(String args[]) {
	ArrayList<Object> al = new ArrayList<Object>();
	al.add("Welcome");
	al.add(7);
	al.add(7.000);
	al.add('A');
	al.add(true);
	System.out.println("Printing the List : " + al);// [Welcome, 7, 7.0, A, true]
	System.out.println("Size of an ArrayList : " + al.size());// 5
	al.remove(0);
	System.out.println("After removing the 0 Index : " + al);// [7, 7.0, A, true]
	al.add(2, "Welcome");
	System.out.println("After adding the Welcome in index 2 : " + al);// [7, 7.0, Welcome, A, true]
	System.out.println("getting particular element ex:index2 : " + al.get(2));// Welcome
	al.set(2, "Replacing");
	System.out.println("After replacing the particular Index : " + al);// [7, 7.0, Replacing, A, true]
	System.out.println("Searching element is contains :" + al.contains(7));// true
	System.out.println("Searching element is notcontains :" + al.contains(71));// false
	System.out.println("Checking List is empty or not :" + al.isEmpty());// false
	System.out.println();
	// Reading the data from different approaches

	// 1.forLoop
	System.out.println("Reading the list using for loop.......");
	for (int i = 0; i < al.size(); i++) {
	    System.out.print(al.get(i) + " ");// 7 7.0 Replacing A true
	}
	// 2.foreach
	System.out.println();
	System.out.println("Readimg the list using foreach loop.......");
	for (Object a : al) {
	    System.out.print(a + " ");// 7 7.0 Replacing A true
	}
	System.out.println();
	System.out.println("Reading the list using iterator loop.......");
	Iterator<Object> it = al.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + " ");
	}
	System.out.println();

	// Other Examples
	ArrayList<String> ax = new ArrayList<String>();
	ax.add("A");
	ax.add("G");
	ax.add("C");
	ax.add("Z");
	ax.add("B");
	System.out.println("Printing ax list" + ax);// [A, G, C, Z, B]
	// adding the ax to new ArrayList
	ArrayList<Object> dup = new ArrayList<Object>();
	dup.addAll(ax);
	System.out.println("Print after adding the list to dup :" + dup);// [A, G, C, Z, B]
	dup.removeAll(dup);
	System.out.println("Print after removing the list to dup :" + dup);// []

	// Sorting the list of Elements in Ascending Order
	System.out.println("Printing ax list Before Sorting" + ax);// [A, G, C, Z, B]
	Collections.sort(ax);
	System.out.println("Printing ax list After sorting" + ax);// [A, B, C, G, Z]
	// sorting the list of Elements in reverse Order
	Collections.sort(ax, Collections.reverseOrder());
	System.out.println("Printing ax list After sorting Descending Order" + ax);// [Z, G, C, B, A]
	// Shuffling all the List
	Collections.shuffle(ax);
	System.out.println("Print ax list after shuffling :" + ax);// shuffled elements

	// Converting the Normal Array to ArrayList
	String arr[] = { "Vinay", "Aksha", "Vihan" };
	for (String s : arr) {
	    System.out.print(s + " ");
	}
	System.out.println();// Vinay Aksha Vihan
	System.out.println("After converting Normal Array to ArrayList");
	ArrayList<Object> alc = new ArrayList<Object>(Arrays.asList(arr));
	System.out.println(alc);// [Vinay, Aksha, Vihan]

    }
}
