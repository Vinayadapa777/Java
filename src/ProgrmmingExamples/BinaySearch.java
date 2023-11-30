package ProgrmmingExamples;

public class BinaySearch {
    public static int search(int arr[], int key) {
	int low = 0;
	int high = arr.length - 1;
	int mid = (low + high) / 2;
	while (low < high) {
	    if (arr[mid] < key) {
		low = mid + 1;
	    } else if (arr[mid] > key) {
		high = mid - 1;
	    } else if (arr[mid] == key) {
		return mid;
	    }
	    mid=(low+high)/2;
	}
	if (low > high) {
	    return -1;
	}
	return -1;
    }

    public static void main(String[] args) {
	int arr[] = { 0, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	System.out.println(search(arr,11));

    }

}
