package keywords;

public class StaticBlock {
    public void sample() {
	System.out.println("in a method");
    }

    public StaticBlock() {
	System.out.println("In a Constructor");
    }

    static {
	System.out.println("in static block");
    }

    

    public static void main(String[] args) {
	//without creating object we can execute static block
	StaticBlock s1 = new StaticBlock();
//	s1.sample();
//	StaticBlock s2 = new StaticBlock();
    }

}
