package Stacks;

import java.util.Stack;

public class Balanced_para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((((())))))";
		Stack<Character> st = new Stack<Character>();
		for(int i= 0; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch == '(') st.push(ch);
			else {
			if(!st.isEmpty() && st.peek() == '('){	
				st.pop();
		}else {
			System.out.println("Not");
			return;
		}
			}
			
		}
		if(st.isEmpty()) {
			System.out.println("Yes");
			return;
		}
		System.out.println("Not");

	}

}
