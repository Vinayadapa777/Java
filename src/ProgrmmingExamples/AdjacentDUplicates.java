package ProgrmmingExamples;

import java.util.Stack;

public class AdjacentDUplicates {

    public static String adjDup(String sname) {
	String name=sname.toLowerCase();
	Stack<Character> stack= new Stack<>();
	
	for(char c:name.toCharArray()) {
	    if(!stack.empty() && stack.peek()==c) {
		stack.pop();
	    }else {
		stack.push(c);
	    }
	}
	StringBuilder sb = new StringBuilder();
	while(!stack.empty()) {
	    sb.append(stack.pop());
	}
	return sb.reverse().toString();
    }

    public static void main(String[] args) {
	System.out.println(adjDup("gEeksffOoorgGeek"));
    }

}
