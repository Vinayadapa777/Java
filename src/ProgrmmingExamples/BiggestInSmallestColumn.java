package ProgrmmingExamples;

public class BiggestInSmallestColumn {
    // We need to find the Biggest Number in the smallest number column
    public static void BiggestInSmallest(int arr[][]) {
	int smallest = Integer.MAX_VALUE;
	int column = 0;
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length; j++) {
		if (arr[i][j] < smallest) {
		    smallest = arr[i][j];
		    column = j;
		}
	    }
	}
	System.out.println("Required column as per smallest number in array :" + column);
	System.out.println("Smallest number in the array :" + smallest);
	int k = 0;
	int biggest = Integer.MIN_VALUE;
	while (k < arr.length) {
	    if (arr[k][column] > biggest)
		biggest = arr[k][column];
	    k++;
	}
	System.out.println("Biggest value in the smallest number Column :" + biggest);
    }

    public static void main(String[] args) {
	int arr[][] = { { 11, 2, 3 }, { 4, 5, 6 }, { 12, 61, 9 } };
	BiggestInSmallest(arr);

    }
}
