package Stacks;

import java.util.Stack;

public class Infix_Expre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "9-(5+3)*4/6";
		Stack<Integer> val = new Stack<Integer>();
		Stack<Character> op = new Stack<Character>();
		
		for(int i =0 ; i < st.length() ; i++) {
			char ch = st.charAt(i);
			
			int ascaii = (int)ch;
			if(ascaii >= 48 && ascaii <= 57) val.push(ascaii-48);
			else if(op.isEmpty() || ch == '(' || op.peek() == '(' || ch == '^') op.push(ch);
			else if(ch == ')') {
				while(op.peek() != '(') {
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek() == '+') val.push(v1+v2);
					if(op.peek() == '-') val.push(v1-v2);
					if(op.peek() == '*') val.push(v1*v2);
					if(op.peek() == '/') val.push(v1/v2);
					op.pop();
				}
				//Removing '(' from stack
				op.pop();
			}
			else {
				if(ch == '+' || ch == '-') {
					//work
					int v2 = val.pop();
					int v1 = val.pop();
					if(op.peek() == '+') val.push(v1+v2);
					if(op.peek() == '-') val.push(v1-v2);
					if(op.peek() == '*') val.push(v1*v2);
					if(op.peek() == '/') val.push(v1/v2);
					
					
					//push and pop
					op.pop();
					op.push(ch);
				}
				if(ch == '*' || ch == '/') {
					if(op.peek() == '*' || op.peek() == '/' || op.peek() == '^') {
						int v2 = val.pop();
						int v1 = val.pop();
						if(op.peek() == '*') val.push(v1*v2);
						if(op.peek() == '+') val.push(v1/v2);
						op.pop();
						op.push(ch);
					}else op.push(ch);
				}
			}
		}
		while(val.size() > 1) {
			int v2 = val.pop();
			int v1 = val.pop();
			if(op.peek() == '+') val.push(v1+v2);
			if(op.peek() == '-') val.push(v1-v2);
			if(op.peek() == '*') val.push(v1*v2);
			if(op.peek() == '/') val.push(v1/v2);
			op.pop();
		}
		System.out.println(val.pop());

	}

}
