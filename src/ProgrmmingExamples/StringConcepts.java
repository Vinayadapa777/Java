package ProgrmmingExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringConcepts {
    public static int characterCountInString(String name) {
	int count = 0;
	for (int i = 0; i < name.length(); i++) {
	    if (name.charAt(i) != ' ')
		count++;
	}
	return count;
    }

    public static String reverseString(String name) {
	String reverseString = "";
	for (int i = name.length() - 1; i >= 0; i--) {
	    reverseString += name.charAt(i);
	}
	return reverseString;
    }

    public static String reverseStringBuilder(String name) {
	StringBuilder sb = new StringBuilder(name);
	return sb.reverse().toString();

    }

    public static String reverseEachString(String name) {
	String reverse = "";
	String each[] = name.split(" ");
	for (String eachname : each) {
	    String eachreverse = "";
	    for (int i = eachname.length() - 1; i >= 0; i--) {
		eachreverse += eachname.charAt(i);
	    }
	    reverse += eachreverse + " ";
	}
	return reverse;
    }

    public static String reverseeachStringUsingBuilder(String name) {
	String each[] = name.split(" ");
	String reverse = "";
	for (String eachName : each) {
	    StringBuilder sb = new StringBuilder(eachName);
	    reverse += sb.reverse().toString() + " ";
	}
	return reverse;
    }

    public static void uniqueCharInString(String stringname) {
	Set<Object> unique = new HashSet<>();
	String name = stringname.toLowerCase();
	for (int i = 0; i < name.length(); i++) {
	    if (!unique.contains(name.charAt(i)) && name.charAt(i) != ' ') {
		unique.add(name.charAt(i));
		int count = 1;
		for (int j = i + 1; j < name.length(); j++) {
		    if (name.charAt(i) == name.charAt(j)) {
			count++;
		    }
		}
		if (count == 1) {
		    System.out.println("count of character  '" + name.charAt(i) + "' = " + count);
		} else if (count > 1) {
		    System.out.println("count of character  '" + name.charAt(i) + "' = " + count);
		}
	    }
	}
    }

    public static void diffCharCount(String name) {
	int alphabet = 0;
	int specialCharacter = 0;
	int digit = 0;
	int space = 0;
	for (int i = 0; i < name.length(); i++) {
	    char ch = name.charAt(i);
	    if (Character.isAlphabetic(ch)) {
		alphabet++;
	    } else if (Character.isDigit(ch)) {
		digit++;
	    } else if (Character.isWhitespace(ch)) {
		space++;
	    } else {

		specialCharacter++;
	    }
	}
	System.out.println("Special Characters =" + specialCharacter);
	System.out.println("Alphabets =" + alphabet);
	System.out.println("Numeric Digits =" + digit);
	System.out.println("White Spaces =" + space);
    }

    public static void vowelsPresent() {
	List<String> name = Arrays.asList("Sky", "Apple", "Banana", "Carrot");
	for (String n : name) {
	    int count = 0;
	    boolean flag = false;
	    String fruits = n.toLowerCase();
	    for (int i = 0; i < fruits.length(); i++) {
		char ch = fruits.charAt(i);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    flag = true;
		    count++;
		}
	    }
	    if (flag == true) {
		System.out.println(fruits + ": contains Vowels and count of Vowels :" + count);
	    }
	}
    }

    public static String removinhg(String name) {
	return name.replaceAll("[^a-z,0-9]", "");

    }

    public static String spaceRemoval(String name) {
	StringBuilder output = new StringBuilder();
	for (int i = 0; i < name.length(); i++) {
	    if (!Character.isWhitespace(name.charAt(i))) {
		output.append(name.charAt(i));
	    }
	}
	return output.toString();
    }

    static boolean ovewls(String name) {
	return name.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
	String name = "Vinay Adapa";
	System.out.println("Character count in the string :" + characterCountInString(name));
	System.out.println("Reverse String :" + reverseString(name));
	System.out.println("Reverse Each String :" + reverseEachString(name));
	uniqueCharInString(name);
	System.out.println(reverseStringBuilder(name));
	String name1 = "Vinay Sai Manikantha Adapa";
	System.out.println(reverseeachStringUsingBuilder(name1));
	diffCharCount(" as123@#^");
	vowelsPresent();
	System.out.println(removinhg("1233sfdfg#@@$#"));
    }

}
