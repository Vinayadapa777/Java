package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
//    1.HashSet stores the elements by using a mechanism called hashing.
//    2.HashSet contains unique elements only.
//    3.HashSet allows null value.
//    4.HashSet class is non synchronized.
//    5.HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//    6.HashSet is the best approach for search operations.
//    7.The initial default capacity of HashSet is 16, and the load factor is 0.75.
    public static void main(String[] args) {
//	HashSet<Object> hs= new HashSet<Object>(100);//Initial capacity 100
//	HashSet<Object> hs= new HashSet<Object>(100,(float) 0.90);//Initial Capacity 100 with load factor 90
	HashSet<Object> hs = new HashSet<Object>();
	hs.add("Vinay");
	hs.add('A');
	hs.add(7);
	hs.add(true);
	hs.add(null);
	hs.add("Vinay");
	System.out.println("Printing the HashSet :" + hs);// [null, A, 7, Vinay, true]
	hs.remove('A');// need to specify the object not the index as we don't have index in sets
	System.out.println("After removing the Object from Set :" + hs);// [null, 7, Vinay, true]
	System.out.println("Checking is element is present :" + hs.contains("Welcome"));// false
	System.out.println("Checking is element is present :" + hs.contains("Vinay"));// true
	System.out.println("Checking is HasSet is empty :" + hs.isEmpty());// false

	// Reading the data of HashSet
	// 1.for each
	for (Object s : hs) {
	    System.out.print(s + " ");// null 7 Vinay true
	}
	// 2.Iterator Methos
	System.out.println();
	Iterator<Object> it = hs.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + " ");// null 7 Vinay true
	}
	
	HashSet<Integer> evenNumber=new HashSet<Integer>();
	evenNumber.add(2);
	evenNumber.add(4);
	evenNumber.add(6);
	evenNumber.add(8);
	System.out.println("Printing evenNumber : "+evenNumber);//[2, 4, 6, 8]
	HashSet<Integer> number=new HashSet<Integer>();
	number.add(1);
	number.add(3);
	number.add(5);
	System.out.println("Printing number : "+number);//[1, 3, 5]
	number.addAll(evenNumber);
	System.out.println("Printing combined numbers : "+number);//[1, 2, 3, 4, 5, 6, 8]
	number.removeAll(evenNumber);
	System.out.println("after removing even number from all :"+number);//[1, 3, 5]

        //Union,Intersection and Difference 
	HashSet<Object> set1 = new HashSet<Object>();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	System.out.println("Printing set1 :"+set1);//[1, 2, 3, 4, 5]
	
	HashSet<Object> set2 = new HashSet<Object>();
	set2.add(6);
	set2.add(7);
	set2.add(5);
	set2.add(9);
	set2.add(1);
	System.out.println("Printing set2 :"+set2);//[1, 5, 6, 7, 9]

	//Union
//	set1.addAll(set2);
//	System.out.println("Union results : " +set1);//[1, 2, 3, 4, 5, 6, 7, 9]
	
	//Intersection
//	set1.retainAll(set2);
//	System.out.println("Intersection of set1 and set2 :"+set1);//[1, 5]
	
	set1.removeAll(set2);
	System.out.println("Differnce in set1 from set2 : "+set1);//[2, 3, 4]
	
    }

}
