package loops;

public class ForLoop {

    public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int count=sc.nextInt();
	
	for(int i=1;i<=5;i++) {
		System.out.println("Day : "+i);
		for(int j=0;j<9;j++) {
			System.out.println(j+9);
		}
	}

}

}
