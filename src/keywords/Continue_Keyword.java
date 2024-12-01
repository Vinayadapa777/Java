package keywords;

public class Continue_Keyword {

    public static void main(String[] args) {
	int k = 0;
	while (k < 10) {
	    if (k == 5) {
		k++;
		continue;
	    }
	    System.out.println(k);
	    k++;
	}
    }
}
