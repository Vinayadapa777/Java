package ProgrmmingExamples;

public class ReverseNumber {

    public static long reverseNumber(long num) {
	long reverseNum = 0;
	while (num != 0) {
	    long reminder = num % 10;
	    reverseNum = reverseNum * 10 + reminder;
	    num /= 10;
	}
	return reverseNum;
    }

    public static void main(String[] args) {
	long number = 87654321;
	System.out.println("Reverse number :" + reverseNumber(number));
    }
}
