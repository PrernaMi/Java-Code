package Stacks;


import java.util.Stack;

public class Basics {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(354);
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		
		}

}
