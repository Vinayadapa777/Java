package StringConcepts;

public class StringBuilderBuffer {
    public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Vinay");

	// default StringBuffer having 16bytes of capacity and the string adding to that
	// is the addition capacity along with the default capacity
	System.out.println(sb.capacity());// 21
	System.out.println(sb.length());// 5
	// by using String Buffer we can make a changes to the existing string and we
	// can modify accordingly
	// By using String Builder is same as String Buffer but the difference is String
	// Buffer is thread safe
	StringBuilder sc = new StringBuilder("Ashok Adapa");
	System.out.println(sc.append('V'));
	sc.insert(1, 'B');
	System.out.println(sc);

    }
}
