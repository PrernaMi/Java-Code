package Stacks;

import java.util.Stack;

public class Min_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ")((())())(()";
		Stack<Character> st = new Stack<Character>();
		for(int i =0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch == '(') st.push(ch);
			else if(ch == ')') {
				if(!st.isEmpty() && st.peek() == '(') st.pop();
				else st.push(ch);
			}
		}
		System.out.println(st.size());

	}

}
