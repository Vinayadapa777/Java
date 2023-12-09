package keywords;

class sample {
    final void age() {
	System.out.println("final method");
    }
}

public class Final_Keyword extends sample {
//    we can override the extended final method it throws compilation error

//    public void age() {
//	System.out.println("final method");
//    }

    public static void main(String[] args) {
	final int k = 9;
	System.out.println(k);
//	k++;//we can't change the final declared variable

    }

}
