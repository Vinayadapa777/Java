package ProgrmmingExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated {

    public static Map<Object, Integer> countOccurrences(Collection<Object> list) {
	Map<Object, Integer> occurrenceMap = new HashMap<>();
	for (Object obj : list) {
	    // Use getOrDefault for simpler logic
	    occurrenceMap.put(obj, occurrenceMap.getOrDefault(obj, 0) + 1);
	}
	return occurrenceMap;
    }

    public static void main(String[] args) {
	List<Object> list = Arrays.asList("q", "sai", "q");
	System.out.println(countOccurrences(list));
    }
}
