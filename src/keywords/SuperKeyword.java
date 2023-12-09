package keywords;

class parent {
    int j = 9;

    public parent() {
	System.out.println("parent class");
    }

    public parent(int a) {
	System.out.println("parameterized parent class");
    }

    public void sampleparent() {
	System.out.println("sampleparent method");
    }
}

class child extends parent {
    public child() {
	super(78);// constructor must be call at first instance and it should call in constructor
	// block only
	System.out.println(super.j);
	super.sampleparent();
	System.out.println("child class");

    }

    public child(int b) {
	super();
	System.out.println("parameterized child class");
    }

    public void samplechild() {// we cant get the constructor of super in normal methods
	super.sampleparent();
	System.out.println(super.j);
	System.out.println("samplechild method");
    }

}

public class SuperKeyword {

    public static void main(String[] args) {
	child c = new child(4);
    }

}
