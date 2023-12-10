package oopsConcepts;

import oopsConcepts.A;
import oopsConcepts.B;

//In java we can use multilevel inheritance 
//But in java there is no support for the multiple inheritance
class A {
    public void Amethod() {
	System.out.println("class A");
    }
    public void Amethod1() {
   	System.out.println("class A1");
       }
    
}

class B extends A {
    public void Bmethod() {
	System.out.println("class B");
    }
}

class C extends B {
    public void Cmethod() {
	System.out.println("class C");
    }
}
//But in java there is no support for the multiple inheritance
//Because if we have same methods in Class A and B then it get confuse which method to take so multiple extends is not possible 
//class D extends A, B {
//    public void Dmethod() {
//	System.out.println("class C");
//    }
//}

public class Inheritance {

    public static void main(String[] args) {
	C C = new C();
	C.Amethod();
	C.Bmethod();
	C.Cmethod();
	
	
    }

}
