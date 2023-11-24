package JavaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
//1.  Java LinkedList class uses a doubly linked list to store the elements.
//    It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.
//2.  Java LinkedList class can contain duplicate elements.
//3.  Java LinkedList class maintains insertion order.
//4.  Java LinkedList class is non synchronized.
//5.  In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//6.  Java LinkedList class can be used as a list, stack or queue.
    public static void main(String[] args) {
	// LinkedList <Integer> ll= new LinkedList <Integer>();//For Homogeneous Data
	LinkedList<Object> l = new LinkedList<Object>();
	l.add(700);
	l.add("Vinay");
	l.add('A');
	l.add(true);
	l.add(null);
	l.add(7.77);
	System.out.println("Printing linkedlist l" + l);// [700, Vinay, A, true, null, 7.77]
	System.out.println("size of a list : " + l.size());// 6
	l.remove(3);
	System.out.println("After removing 3 Index : " + l);// [700, Vinay, A, null, 7.77]
	l.add(1, "first");
	System.out.println("After inserting the String in 1st index : " + l);// [700, first, Vinay, A, null, 7.77]
	System.out.println("retriving value using index :" + l.get(3));// A
	l.set(0, 777);
	System.out.println("After changing the values :" + l);// [777, first, Vinay, A, null, 7.77]
	System.out.println("Check is particular object present : " + l.contains("Vinay"));// true
	System.out.println("Check is particular object present : " + l.contains("Dhoni"));// false
	System.out.println("Check is list is Empty or not : " + l.isEmpty());// false

	// Reading the data from different approaches

	// 1.forLoop
	System.out.println("Reading the list using for loop.......");
	for (int i = 0; i < l.size(); i++) {
	    System.out.print(l.get(i) + " ");// 777 first Vinay A null 7.77
	}
	// 2.foreach
	System.out.println();
	System.out.println("Readimg the list using foreach loop.......");
	for (Object a : l) {
	    System.out.print(a + " ");// 777 first Vinay A null 7.77
	}
	System.out.println();

	// 3.using Iterator method
	System.out.println("Reading the list using iterator loop.......");
	Iterator<Object> it = l.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + " ");// 777 first Vinay A null 7.77
	}
	System.out.println();

	LinkedList<Integer> l1 = new LinkedList<Integer>();
	l1.add(8);
	l1.add(4);
	l1.add(7);
	l1.add(1);
	l1.add(9);
	System.out.println("Elements in l1 list : "+l1);//[8, 4, 7, 1, 9]
	LinkedList<Integer> l2 = new LinkedList<Integer>();
	l2.add(18);
	l2.add(14);
	l2.add(17);
	l2.add(11);
	l2.add(19);
	System.out.println("Elements in l1 list : "+l2);//[18, 14, 17, 11, 19]
	l1.addAll(l2);
	System.out.println("after adding l2 with l1 : "+l1);//[8, 4, 7, 1, 9, 18, 14, 17, 11, 19]
	l1.removeAll(l2);
	System.out.println("after removing l2 with l1 : "+l1);//[8, 4, 7, 1, 9]
	
	//Sorting functions
	System.out.println("Before sorting l1 :"+l1);//[8, 4, 7, 1, 9]
	Collections.sort(l1);
	System.out.println("After sorting in Ascending l1 :"+l1);//[1, 4, 7, 8, 9]
	Collections.sort(l1,Collections.reverseOrder());
	System.out.println("After sorting in Descending l1:"+l1);//[9, 8, 7, 4, 1]
	Collections.shuffle(l1);
	System.out.println("After Shuffleing l1:"+l1);
	
	
	
	//Specific methods in LinkedList 
	LinkedList<Object> a = new LinkedList<Object>();
	a.add("Vihan");
	a.add("Aksha");
	a.add("Vinay");
	System.out.println("Print the a list : "+a);//[Vihan, Aksha, Vinay]
	a.addFirst("Adapa");
	a.addLast("Ashok");
	System.out.println("After adding first and last elements : "+a);//[Adapa, Vihan, Aksha, Vinay, Ashok]
	System.out.println("Getting first element : "+a.getFirst());//Adapa
	System.out.println("Getting last element : "+a.getLast());//Ashok
	a.removeFirst();
	System.out.println("After removing First Element in list :"+a);//[Vihan, Aksha, Vinay, Ashok]
	a.removeLast();
	System.out.println("After removing last Element in list :"+a);//[Vihan, Aksha, Vinay]

        //When Linked list implemeted By using the Queue Interface
	//The major difference between LinkedList and Priority Queue ,Linkedlist allow Heterogeneous Data
	LinkedList<Object> lq=new LinkedList<Object> ();
	lq.add("Ashok");
	lq.offer("Vinay");
	lq.offerFirst(7);
	lq.offerLast('A');
	lq.offer("Vihan");
	System.out.println(lq);//[7, Ashok, Vinay, A, Vihan]
	System.out.println(lq.element());//7
	System.out.println(lq.peek());//7
	System.out.println(lq.peekLast());//Vihan
	System.out.println(lq.remove());//7(Which return and remove
	System.out.println(lq.poll());//Ashok
	System.out.println(lq.pollLast());//Vihan
	System.out.println(lq);//[ Vinay, A]
	
    }

}
