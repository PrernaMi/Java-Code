package Stacks;

import java.util.Stack;

public class Print_Recur {
	
	public static void display(Stack<Integer> s) {
		if(s.isEmpty()) return;
		int x = s.pop();
		System.out.print(x+" ");
		display(s);
	}
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		display(st);
	}

}
