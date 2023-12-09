package keywords;

public class Finalize_Keyword {
    // we called this finalize method to garbage the object which is unused
    // garbage collector calling as shown blow by making it null and garbaging the
    // same object by using system.gc java.lang.System.gc()
    // we will get all the garbage at the end of the execution

    public void add(int a, int b) {
	System.out.println(a + b);
    }

    public void finalize() {
	System.out.println("executed finalize method");
    }

    public static void main(String[] args) {
	Finalize_Keyword b = new Finalize_Keyword();
	b.add(10, 20);
	System.out.println(b.hashCode());
	b = null;
	// calling garbage collector
	System.gc();
	// now the finalize method call here
	// System.out.println(b.hashCode());
	Finalize_Keyword b1 = new Finalize_Keyword();
	b1.add(10, 20);
	b1 = null;
	// calling garbage collector
	System.gc();
	// now the finalize method call here

    }
//    output:
//	30
//	212628335
//	30
//	executed finalize method
//	executed finalize method
}
