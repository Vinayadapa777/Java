package oopsConcepts;

class Persons {
    int age;
    String name;

    public Persons(int age, String name) {
	this.name = name;
	this.age = age;
    }

    public void getAge() {
	System.out.println("person age : " + age);
    }

    public void getname() {
	System.out.println("person name : " + name);
    }
}

public class Objectcreation {

    public static void main(String[] args) {
	Persons v = new Persons(25, "Vinay");
	v.getAge();
	v.getname();
	Persons r = new Persons(27, "rajeswari");
	r.getAge();
	r.getname();
    }

}
