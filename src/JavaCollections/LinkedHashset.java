package JavaCollections;

import java.util.LinkedHashSet;

public class LinkedHashset {
//  1.HashSet stores the elements by using a mechanism called hashing.
//  2.HashSet contains unique elements only.
//  3.HashSet allows null value.
//  4.HashSet class is non synchronized.
//  5.HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//  6.HashSet is the best approach for search operations.
//  7.The initial default capacity of HashSet is 16, and the load factor is 0.75.
    public static void main(String[] args) {

	LinkedHashSet<Object> ls = new LinkedHashSet<Object>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	//same as HashSet apart from the Insertion order
	System.out.println(ls);//[1, 2, 3, 4, 5]

    }

}
