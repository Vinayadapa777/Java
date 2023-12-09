package oopsConcepts;

class person {
    private int age;
    private String name;

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
	person ps = new person();
	ps.setAge(25);
	ps.setName("Tester");
	System.out.println(ps.getName() + ":" + ps.getAge());
	// System.out.println(ps.age); //The field person.age is not visible

    }
    // Private: The access level of a private modifier is only within the class. It
    // cannot be accessed from outside the class.
    /*
     * Private: The access level of a private modifier is only within the class. It
     * cannot be accessed from outside the class.Default: The access level of a
     * default modifier is only within the package. It cannot be accessed from
     * outside the package. If you do not specify any access level, it will be the
     * default.Protected: The access level of a protected modifier is within the
     * package and outside the package through child class. If you do not make the
     * child class, it cannot be accessed from outside the package.Public: The
     * access level of a public modifier is everywhere.It can be accessed from
     * within the class, outside the class, within the package and outside the
     * package.
     */

}
