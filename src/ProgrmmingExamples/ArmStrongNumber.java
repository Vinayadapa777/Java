package ProgrmmingExamples;

public class ArmStrongNumber {
    // ArmStrong number is power of each digit is total digits of the number
    public static void armStrongNumber(int limit) {
	for (int i = 1; i <= limit; i++) {
	    int sum = 0;
	    int last = 0;
	    int digit = 0;
	    int temp = i;
	    while (temp > 0) {
		temp /= 10;
		digit++;
	    }
	    temp = i;
	    while (temp > 0) {
		last = temp % 10;
		sum += Math.pow(last, digit);
		temp /= 10;
	    }
	    if (sum == i) {
		System.out.print(i + " ");
	    }
	}
    }

    public static void main(String[] args) {
	armStrongNumber(2000);
    }

}
