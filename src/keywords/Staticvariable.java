package keywords;

public class Staticvariable {
    static int i = 1;

    Staticvariable() {
	System.out.println(i);
	i++;
    }

    public static void main(String[] args) {
	Staticvariable s1 = new Staticvariable();
	Staticvariable s2 = new Staticvariable();
	Staticvariable s3 = new Staticvariable();

    }

}
