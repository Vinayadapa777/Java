package oopsConcepts;

class First {
    public void method1() {
	System.out.println("class First method 1");
    }

    public void method2() {
	System.out.println("class First method 2");
    }
}

class Second extends First {
    public void method3() {
	System.out.println("class Second method 3");
    }

    @Override
    public void method2() {
	System.out.println("class Second method 2");
    }
}

public class methodOverriding {

    public static void main(String[] args) {
	First a = new First();
	a.method1();
	a.method2();
	Second b = new Second();
	b.method2();

    }

}
