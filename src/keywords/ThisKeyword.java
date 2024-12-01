package keywords;

public class ThisKeyword {
	private int age;

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

	private String name;

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
		t.setAge(25);
		t.setName("Vinay");
		System.out.println(t.getAge()+" : "+t.getName());

	}

}

