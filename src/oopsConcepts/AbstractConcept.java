package oopsConcepts;

public abstract  class AbstractConcept {
//    /Data abstraction is the process of hiding certain details and showing only essential information to the user.
//    Abstraction can be achieved with either abstract classes or interfaces 
//    The abstract keyword is a non-access modifier, used for classes and methods:
//    Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//    An abstract class must be declared with an abstract keyword.
//    It can have abstract and non-abstract methods.
//    It cannot be instantiated.
//    It can have constructors and static methods also.
//    It can have final methods which will force the subclass not to change the body of the method.

    abstract void firstMethod();
    // Above is an Abstract method ,which don't have body

    public AbstractConcept() {
	System.out.println("In Abstract Constructor ");
    }

    public void nonabstratmethod() {
	System.out.println("In non abstract/regular Method");
    }

    public static void staticmethod() {
	System.out.println("In non static Method");
    }
//  It cannot be instantiated/ Create an object for the abstract class

}

class child extends AbstractConcept {

    // Implementing the abstract method by overriding and implementing
    @Override
    void firstMethod() {
	System.out.println("Implemented Abstract method");

    }

    public void childmethod() {
	System.out.println("In Child method");
    }

    public static void main(String args[]) {
	child cd = new child();
	cd.firstMethod();

    }

}
