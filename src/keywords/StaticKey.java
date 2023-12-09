package keywords;

class MobilePhone {
    String brand;
    int price;
    static String osName;

    public void display() {
	System.out.println(brand + " : " + price + " : " + osName);
    }
}

public class StaticKey {

    public static void main(String[] args) {

	MobilePhone m1 = new MobilePhone();
	m1.brand = "Apple";
	m1.price = 50000;
	m1.osName = "ios";
	MobilePhone m = new MobilePhone();
	m.brand = "OnePlus";
	m.price = 45000;
	m.osName = "android";
	m1.display();
	m.display();

    }

}
