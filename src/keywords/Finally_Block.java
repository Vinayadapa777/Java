package keywords;

public class Finally_Block {
//Independent of Try and Catch block finally will always execute after try and catch
    public static void main(String[] args) {
	int i=0;
	try {
	   i= 3/i;
	   System.out.println("Try block");
	}catch (Exception e) {
	    System.out.println("in catch Block");
	}finally {
	    System.out.println("In final Block");
	}
    }

}
