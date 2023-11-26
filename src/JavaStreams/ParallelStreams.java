package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {
	List<student> data = Arrays.asList(new student("Vinay", 90), new student("Akshara", 80),
		new student("Vihan", 95), new student("manikantha", 70), new student("Ashok", 79));
	// using stream methods
	System.out.println("Using strema methods");
	data.stream().filter(p -> p.getscore() > 79).limit(3)
		.forEach(p -> System.out.print(p.getName() + "=" + p.getscore() + " ,"));
	// using Parallel stream
	System.out.println();
	System.out.println("Using Paralel streams");
	data.parallelStream().filter(p -> p.getscore() > 79).limit(3)
		.forEach(p -> System.out.print(p.getName() + "=" + p.getscore() + " ,"));
	// converting streams into parallel streams
	System.out.println();
	System.out.println("Converting normal streams into parallel streams");
	data.stream().parallel().filter(p -> p.getscore() > 79).limit(3)
		.forEach(p -> System.out.print(p.getName() + "=" + p.getscore() + " ,"));

    }

    static class student {
	int score;
	String name;

	public student(String name, int score) {
	    this.name = name;
	    this.score = score;
	}

	public int getscore() {
	    return this.score;
	}

	public String getName() {
	    return this.name;
	}
    }

}
