package interviewRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackAlphabetPattern {

	public static void main(String[] args) {
		String str= "acaaabbbbbcbbac";
		char[] strArray = str.toCharArray();
		
		checkPattern(strArray,str.length());

	}
	public static void checkPattern(char[] str, int n) {
		char[] stack = new char[n];
		//List<Character> list = new ArrayList<Character>();
		String newStr = "";
		int top = -1;
		for(int i = 0; i < n; i++) {
			if(str[i] == 'a') {
				if(top == -1 || stack[top] == 'c') {
					top = top + 1;
					stack[top] = str[i];
					newStr = newStr + stack[top];
					//list.add(stack[top]);
				}
			}else if (str[i] == 'c') {
				if(top > -1 && stack[top] == 'a') {
					top = top + 1;
					stack[top] = str[i];
					newStr = newStr + stack[top];
					//list.add(stack[top]);
				}
			}
		}
		System.out.println(newStr);
	}

}
