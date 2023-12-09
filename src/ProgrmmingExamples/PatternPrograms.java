package ProgrmmingExamples;

public class PatternPrograms {

    static void leftTriangle(int rows) {
	for (int i = 1; i <= rows; i++) {
	    for (int j = 1; j <= i; j++) {
		System.out.print("* ");
	    }
	    System.out.println();
	}
    }

    static void rightTriangle(int rows) {
	for (int i = 1; i <= rows; i++) {

	    for (int k = rows - i; k >= 1; k--) {
		System.out.print("  ");
	    }
	    for (int j = 1; j <= i; j++) {
		System.out.print("* ");
	    }

	    System.out.println();
	}
    }

    static void equalTriangle135(int rows) {
	for (int i = 1; i <= rows; i++) {

	    for (int k = rows - i; k >= 1; k--) {
		System.out.print("  ");
	    }
	    for (int j = 1; j <= 2 * i - 1; j++) {
		System.out.print("* ");
	    }

	    System.out.println();
	}
    }

    static void equalTriangle123(int rows) {
	for (int i = 1; i <= rows; i++) {

	    for (int k = rows - i; k >= 1; k--) {
		System.out.print("  ");
	    }
	    for (int j = 1; j <= i; j++) {
		System.out.print(" *");
	    }

	    System.out.println();
	}
    }

    static void EqualTriangle(int rows) {
	for (int i = 1; i <= rows; i++) {
	    // white spaces in the front of the numbers
	    int numberOfWhiteSpaces = rows - i;

	    // print leading white spaces
	    printString(" ", numberOfWhiteSpaces);

	    // print character
	    printString("* ", i);

	    // move to next line
	    System.out.println("");
	}
    }

    public static void printString(String str, int times) {
	for (int i = 0; i < times; i++) {
	    System.out.print(str);
	}
    }

    static void reverseEqualTriangle(int rows) {
	for (int i = 1; i<=rows; i++) {
	    for (int j = 1; j <i; j++) {
		System.out.print("  ");
	    }
	    for (int k = 0; k <rows - i; k++) {
		System.out.print("  * ");
	    }
	    System.out.println();
	}
    }
    static void patternNum(int rows) {
	//Loop to create number of rows
	for(int i=rows;i>=1;i--) {
	    //Loop to create number of spaces that required 
	    for(int j=i-1;j>=1;j--) {
		System.out.print("  ");
	    }
	    //Loop to print the digits
	    for(int k=i;k<=rows;k++){
		System.out.print(k+" ");
	    }
	    for(int l=rows-1;l>=i;l--) {
		System.out.print(l+" ");
	    }
	    System.out.println();
	}
    }
    static void patternNumRev(int rows) {
	//Loop to create number of rows
	for(int i=0;i<rows;i++) {
	    //Loop to create number of spaces that required 
	    for(int j=1;j<=i;j++) {
		System.out.print("  ");
	    }
	    //Loop to print the digits
	    for(int k=i+1;k<=rows;k++){
		System.out.print(k+" ");
	    }
	    for(int l=rows-1;l>=i+1;l--) {
		System.out.print(l+" ");
	    }
	    System.out.println();
	}
    }
    

    public static void main(String[] args) {

	patternNumRev(10);
    }

}
