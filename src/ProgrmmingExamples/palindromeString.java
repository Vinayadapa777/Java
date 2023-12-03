package ProgrmmingExamples;

public class palindromeString {

    public static boolean stringPalindrome(String Stringname) {
	String name = Stringname.toLowerCase();
	int i = 0;
	int j = name.length() - 1;

	while (i < j) {
	    if (name.charAt(i) != name.charAt(j)) {
		return false;
	    }
	    i++;
	    j--;
	}
	return true;
    }

    public static void main(String[] args) {
	System.out.println(stringPalindrome("raceciar"));

    }

}
