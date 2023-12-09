package javaBasics;

public class ArthmaticOperations {
    public static void main(String[] args) {
	int num = 7;
	int num1 = 3;
	int result = num / num1;
	System.out.println(result);

	int num2 = 7;
	num2 += 2;
	System.out.println(num2);

	int num3 = 7;
	num3++;
	System.out.println(num3);
	
	
//	Post And Pre Increment the values
	System.out.println("Post And Pre Increments");
	int i=7;
	int res=i++;
	System.out.println(res);
	//As per the above assignment i++ is post increment 
	//where i value is stored as 8 in next time
	System.out.println(i);
	
	//pre Increment
	int k=7;
	int fin=++k;
	System.out.println(fin);
	//Above statement increasing the value and assign to the variable 
	
	
	


	// post increment is where its increment the values and assigned in later
	// statement
	// pre increment is where the valuse is increment and assigned

	// >=,<=,==,!=

}
}
