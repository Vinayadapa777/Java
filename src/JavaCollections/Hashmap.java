package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
//  1.Java HashMap contains values based on the key.
//  2.Java HashMap contains only unique keys.
//  3.Java HashMap may have one null key and multiple null values.
//  4.Java HashMap is non synchronized.
//  5.Java HashMap maintains no order.
//  6.The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
//  7.No insertion Order
    public static void main(String[] args) {
	HashMap<Object, Object> m = new HashMap<Object, Object>();
	m.put(301, "Vinay");
	m.put(302, "Dhoni");
	m.put(303, "Virat");
	m.put(304, "Ashok");
	m.put(301, "Aksha");
	m.put(305, "Vihan");
	m.put(null, null);
	m.put(306, null);
	System.out.println("print all entry sets of the Map");
	System.out.println(m);// {304=Ashok, null=null, 305=Vihan, 306=null, 301=Aksha, 302=Dhoni, 303=Virat}
	System.out.println("Removing the element using Key :" + m.remove(305));// Vihan
	System.out.println("After removing :" + m);
	System.out.println("Conatins Value :" + m.containsKey(505));// false
	System.out.println("Conatins Value :" + m.containsValue("Dhoni"));// true
	System.out.println("Checking is map Empty :" + m.isEmpty());// false
	System.out.println("Print only Keys as a Set :" + m.keySet());// [304, null, 306, 301, 302, 303]
	System.out.println("Printing all the values as Coolection :" + m.values());// [Ashok, null, null, Aksha, Dhoni,
										   // Virat]
	System.out.println("printing as Entries :" + m.entrySet());// [304=Ashok, null=null, 306=null, 301=Aksha,
								   // 302=Dhoni, 303=Virat]
	for (Object k : m.keySet()) {
	    System.out.print(k + " ");
	}
	System.out.println();
	for (Object k : m.values()) {
	    System.out.print(k + " ");
	}

	// extracting the side by side
	System.out.println("Printing all the Key values Side by side");
	for (Object i : m.keySet()) {
	    System.out.println(i + " : " + m.get(i));
	}

	// Reading each Entry Set
	System.out.println("Using Entry Interface");
	// Using For Each Loop
	System.out.println("Printing by using foreach Loop");
	for (Map.Entry<Object, Object> e : m.entrySet()) {
	    System.out.println(e.getKey() + ":" + e.getValue());
	}

	// Reading all the Entries Using Iterator
	System.out.println("Printing by using iterator ");
	Set s=m.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
	    Map.Entry e=(Entry) it.next();
	    System.out.println(e.getKey() + ":" + e.getValue());
	}

    }

}
