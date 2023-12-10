package oopsConcepts;

interface Interface1 {
//    It is used to achieve abstraction.
//    By interface, we can support the functionality of multiple inheritance.
//    It can be used to achieve loose coupling.

    public abstract void method1();

    abstract void privatemethod();

}

interface Interface2 {
    void child1();

    void child2();

}

public class Interfaces implements Interface1, Interface2 {

    @Override
    public void method1() {
	System.out.println("Method 1");
    }

    @Override
    public void privatemethod() {
	System.out.println("privatemethod");

    }

    @Override
    public void child1() {
	System.out.println("child1");

    }

    @Override
    public void child2() {
	System.out.println("child2");

    }

    public static void main(String args[]) {
	Interface2 m = new Interfaces();
	m.child1();
	m.child2();
	// when we create an object as above ,it will display are call the methods of
	// childineterface which is implemented in main class
	Interfaces k = new Interfaces();
	k.child1();
	k.child2();
	k.method1();
	k.privatemethod();
	// if we create the object for the main class we can able to access all methods
	// which is implemented by main class
    }
}
