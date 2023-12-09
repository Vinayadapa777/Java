package javaBasics;

public class DataTypes {
    public static void main(String[] args) {
	
//	  Primitive data Types Integer=byte,short,int,long 
//	  Long -8bytes int-4bytes
//	  short-2bytes
//	  byte-1byte[-128 to 127] 
//	  Float=float,double double is the default
//	  value in the java double -8 bytes float-4 bytes [for float we need to mention
//	  as float a=1.0f] Character=char char-2bytes Boolean=true/false boolean -1
//	  byte Non Primitive Data Types
//	  Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
//	  Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
	 

	// Integer DataTypes
	byte by = 12;
	short sh = 123;
	int num = 18837669;
	long ln = 232376567l;
	// Float DataTypes
	float f = 5.8f;
	double d = 2323.0;
	// Boolean DataType
	boolean s = true;
	boolean r = false;
	// Charter DataType
	char c = 'e';

	// literals
	// for more readable we can use the _(underscroll) as below;

	int num1 = 100_000_00;
	System.out.println(num1);

	// Type casting
	// bigger range values can fit to smaller
	// small range values need to type cast
	int number = 2952;
	byte byt = (byte) number;
	System.out.println(byt);
	float f1 = 5.6f;
	int t = (int) f1;
	System.out.println(t);

	// Type Promotions
	// Where type promotions is when there is a multiplication two byte which
	// results in the exceeding the range of byte then it will automatically
	// promoted the byte to int
	byte a = 12;
	byte b = 50;
	int result = a * b;
	System.out.println(result);

}
}
