package JavaCollections;

import java.util.Stack;

public class StackC {
// 1.Stack is FILO when element which First In Last Out
    public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	Stack<Integer> st1 = new Stack<>();
	st.push(1);
	st.push(2);
	st.push(3);
	st.push(4);
	st.push(5);
	System.out.println(st);//[1, 2, 3, 4, 5]
	System.out.println(st.isEmpty());//false
	System.out.println(st.pop());//5
	System.out.println("After pop :"+st);//[1, 2, 3, 4]
//	System.out.println(st1.pop());//throw empty stack exception
	System.out.println("Geeting peek element without removing :"+st.peek());//4
	System.out.println("After applying PeekMethod :"+st);//[1, 2, 3, 4]
//	System.out.println("Applying peek for empty stack :"+st1.peek());//EmptyStackException

    }

}
