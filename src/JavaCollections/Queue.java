package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
//  Queue is the First IN First Out (FIFO) 
//  Only Homogeneous data only  but allow duplicates  
//  1.As discussed earlier, FIFO concept is used for insertion and deletion of elements from a queue.
//  2.The Java Queue provides support for all of the methods of the Collection interface including deletion, insertion, etc.
//  3.PriorityQueue, ArrayBlockingQueue and LinkedList are the implementations that are used most frequently.
//  4.The NullPointerException is raised, if any null operation is done on the BlockingQueues.
//  5.Those Queues that are present in the util package are known as Unbounded Queues.
//  6.Those Queues that are present in the util.concurrent package are known as bounded Queues.
//  7.All Queues barring the Deques facilitates removal and insertion at the head and tail of the queue; respectively. In fact, deques support element insertion and removal at both ends.
//  8.Insertion order preserved and Duplicates allowed   
    public static void main(String[] args) {
	PriorityQueue<Object> q = new PriorityQueue<Object>();
	PriorityQueue<Object> q1 = new PriorityQueue<Object>();
	q.add("A");
	// add method return true if it add the element else throw Ecxeption
	q.add("Vinay");
	// Offer method return true if it add the element else throw false
	q.offer("Ashok");
	System.out.println("printing queue :" + q);// [A, Vinay, Ashok]

	// Returning elements by following methods

	System.out.println("gettig the first element :" + q.element());// A
//	System.out.println("gettig the first element :"+q1.element());//java.util.NoSuchElementException
	// if element is get return true else NoSuchElementException
	System.out.println("gettig the first by using Peek :" + q.peek());// A
	System.out.println("gettig the first by using Peek :" + q1.peek());// null
	// if element is get return true else null by using Peek Metod

	// Return and Remove the element from the Queue
	System.out.println("Return & Remove from Queue using remove:" + q.remove());// A
	System.out.println("After return & Removed : " + q);// [Ashok, Vinay]
//	System.out.println("Return & Remove from Queue using remove :"+q1.remove());//NosuchElement Exception

	System.out.println("Return & Remove using Poll :" + q.poll());// Ashok
	System.out.println("After return & Removed : " + q);// [Vinay]
	System.out.println("Return & Remove using  Poll :" + q1.poll());// null

	q.add("Vihan");
	q.add("Aksha");
	q.add("Vinay");

	// Reading the queue using Iterator
	Iterator<Object> it = q.iterator();
	while (it.hasNext()) {
	    System.out.print(it.next() + " "); // Aksha Vinay Vihan
	}

	// Reading the Queue using Foreach loop
	System.out.println();
	for (Object s : q) {
	    System.out.print(s + " "); // Aksha Vinay Vihan
	}

	// When Linked list implemented By using the Queue Interface
	// The major difference between LinkedList and Priority Queue ,Linkedlist allow
	// Heterogeneous Data
	LinkedList<Object> lq = new LinkedList<Object>();
	lq.add("Ashok");
	lq.offer("Vinay");
	lq.offerFirst(7);
	lq.offerLast('A');
	lq.offer("Vihan");
	System.out.println(lq);// [7, Ashok, Vinay, A, Vihan]
	System.out.println(lq.element());// 7
	System.out.println(lq.peek());// 7
	System.out.println(lq.peekLast());// Vihan
	System.out.println(lq.remove());// 7(Which return and remove
	System.out.println(lq.poll());// Ashok
	System.out.println(lq.pollLast());// Vihan
	System.out.println(lq);// [ Vinay, A]

    }

}
