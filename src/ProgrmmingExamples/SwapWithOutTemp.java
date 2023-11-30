package ProgrmmingExamples;

public class SwapWithOutTemp {
    public static void swap2Numbers(int a, int b) {
	System.out.println("Before Swap : " + a + " , " + b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After Swap : " + a + " , " + b);
    }
    
    public static void swap3Numbers(int a,int b,int c) {
	System.out.println("Before Swap : " + a + " , " + b+" , "+c);
	a=a+b+c;
	b=a-b-c;
	c=a-b-c;
	a=a-b-c;
	System.out.println("After Swap : " + a + " , " + b+" , "+c);
	
    }
    public static void main(String[] args) {
	swap2Numbers(7,9);
	swap3Numbers(1,2,3);
    }

}
