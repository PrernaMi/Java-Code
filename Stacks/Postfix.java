package Stacks;

import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {

		String s = "9-(5+3)*4/6";
		Stack<String> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		for(int i =0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			int as = (int)ch;
			if(as >= 48 && as <= 57) val.push(ch+"");
			else if(op.isEmpty() || ch == '(' || op.peek() == '(' || ch == '^') op.push(ch);
			else if(ch == ')') {
				while(op.peek() != '(') {
					String v2 = val.pop();
					String v1 = val.pop();
					char x = op.pop();
					val.push(v1+v2+x);
				}
				op.pop();
			}else {
				if(ch == '+' || ch == '-') {
					String v2 = val.pop();
					String v1 = val.pop();
					char x = op.pop();
					val.push(v1+v2+x);
					//push
					op.push(ch);
				}else if(ch == '*' || ch == '/') {
					if(op.peek() == '*' || op.peek() == '/') {
						String v2 = val.pop();
						String v1 = val.pop();
						char x = op.pop();
						val.push(v1+v2+x);
						op.push(ch);
					}else op.push(ch);
				}
			}
					
		}
		while(val.size() > 1) {
			String v2 = val.pop();
			String v1 = val.pop();
			char x = op.pop();
			val.push(v1+v2+x);
		}
		System.out.println(val.pop());
	}

}
