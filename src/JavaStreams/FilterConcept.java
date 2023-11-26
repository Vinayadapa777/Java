package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterConcept {
// 1.Filter is Basically when we want to collect/process the data based on Condition
// 2. Like a if condition

    public static void main(String[] args) {
	List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer> evenNumbers = new ArrayList<>();
	List<Integer> evenNumbersif = new ArrayList<>();
	// Achieving same using normal conditional flows
	// Using the normal if conditions
	for (int n : al) {
	    if (n % 2 == 0) {
		evenNumbersif.add(n);
	    }
	}

	// By using Streams ,Filtering and collecting the data
	evenNumbers = al.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
	System.out.println("By using Streams :" + evenNumbers);

	System.out.println("By using NormalIf Condition :" + evenNumbersif);
	// Printing the filtered data without Storing in any collection
	System.out.println("Printing the filtered data using foreach without collecting to List");
	al.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
	System.out.println("Printing the filtered data using foreach without collecting to List AnotherWay");
	al.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	List<String> namesList = Arrays.asList("Vinay", "Akshara", "Vihan", "Manikantha", "Adapa");
	List<String> noNullNames = new ArrayList<>();
	List<String> conditionalNames = new ArrayList<>();

	noNullNames = namesList.stream().filter(s -> s != null).collect(Collectors.toList());
	System.out.println("Filtering Names without Null :" + noNullNames);
	namesList.stream().filter(m -> m != null).forEach(System.out::println);
	conditionalNames = namesList.stream().filter(m -> m != null && m.length() >= 5 && m.length() <= 7)
		.collect(Collectors.toList());
	System.out.println("Conditional names :" + conditionalNames);

	List<product> prodlist = new ArrayList<>();
	// product list1=new product(0, "Dell", 75000);
	prodlist.add(new product(0, "Dell", 75000));
	prodlist.add(new product(1, "Lenovo", 50000));
	prodlist.add(new product(2, "Apple", 95000));
	prodlist.add(new product(3, "HP", 70000));
	prodlist.add(new product(4, "LG", 60000));

	System.out.println("streams for the customized list");
	prodlist.stream().filter(p -> p.price > 70000).forEach(n -> System.out.println(n.name + "," + n.price));
    }

    static class product {
	int id;
	String name;
	long price;

	public product(int id, String name, long price) {
	    this.id = id;
	    this.name = name;
	    this.price = price;
	}
    }
}
