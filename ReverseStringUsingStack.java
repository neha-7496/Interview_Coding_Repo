package interviewRelated;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "Hello";
		String newString = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		for(int i = 0;i<str.length();i++) {
			newString += stack.peek();
			stack.pop();
			
		}
		System.out.println(newString);

	}

}
