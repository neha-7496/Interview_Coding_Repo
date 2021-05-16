package interviewRelated;

public class StackPatternOperation {

	public static void main(String[] args) {
		
		String str= "{a(b)(){}}[()[]]";
		char[] strArray = str.toCharArray();
		
		checkBalance(strArray,str.length());
	}
	
	public static void checkBalance(char[] str, int n) {
		char[] stack = new char[n];
		int top = -1;
		for(int i = 0; i < n; i++) {
			if(str[i] == '(' || str[i] == '{' || str[i] == '[') {
				top = top + 1;
				stack[top] = str[i];
			}else if(str[i] == ')' || str[i] == '}' || str[i] == ']') {
				if(top == -1) {
					top = top - 1;
					break;
				}else {
					if(str[i] == ')' && stack[top] == '(')
						top = top - 1;
					else if(str[i] == '}' && stack[top] == '{')
						top = top - 1;
					else if(str[i] == ']' && stack[top] == '[')
						top = top - 1;
					else {
						System.out.println("came"+top+":"+str[i]);
						top = top + 1;
						stack[top] = str[i];
					}
						
				}
			}
		}
		if(top == -1) {
			System.out.println("string is balanced");
		}else {
			System.out.println("string is not balanced");
		}
		
	}

}
