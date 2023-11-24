package JavaCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableC {
//    A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
//    Java Hashtable class contains unique elements.
//    Java Hashtable class doesn't allow null key or value.
//    Java Hashtable class is synchronized.
//    The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
    public static void main(String[] args) {
	Hashtable<Object ,Object> t= new Hashtable<Object ,Object>();
	t.put(301, "Vinay");
	t.put(302, "Dhoni");
	t.put(303, "Virat");
	t.put(304, "Ashok");
	t.put(305, "Aksha");
	t.put(306, "Vihan");
	//t.put(null, "x");
	//t.put(307, null);
	//Java Hashtable class doesn't allow null key or value.
	System.out.println(t);//{306=Vihan, 305=Aksha, 304=Ashok, 303=Virat, 302=Dhoni, 301=Vinay}
	System.out.println("Getting value byusing Key :"+t.get(302));//Dhoni
	System.out.println("Removing  entry :"+t.remove(304));//Ashok
	System.out.println("After removing Elements :"+t);//{306=Vihan, 305=Aksha, 303=Virat, 302=Dhoni, 301=Vinay}
	System.out.println(t.containsKey(304));//false
	System.out.println(t.containsValue("Vinay"));//true
	System.out.println(t.isEmpty());//false
	System.out.println(t.keySet());//[306, 305, 303, 302, 301]
	System.out.println(t.values());//[Vihan, Aksha, Virat, Dhoni, Vinay]
	System.out.println(t.entrySet());//[Vihan, Aksha, Virat, Dhoni, Vinay]
	
	for(Object k:t.keySet()) {
	    System.out.println(k+ ":"+t.get(k));
	}
	
	for(Map.Entry<Object, Object> e:t.entrySet()) {
	    System.out.println(e.getKey()+"  : "+e.getValue());
	}
	
	Set s=t.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
	    Map.Entry e=(Entry) it.next();
	    System.out.println(e.getKey()+" ::: "+e.getValue());
	}
    }

}
