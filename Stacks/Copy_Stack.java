package Stacks;

import java.util.Stack;

public class Copy_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> gt = new Stack<Integer>();
		Stack<Integer> rt = new Stack<Integer>();
		
		st.push(3);
		st.push(26);
		st.push(6);
		st.push(35);
		st.push(9);
		System.out.println(st);
		
		while(!st.isEmpty()) {
			gt.push(st.pop());
		}
		System.out.println(gt);
		
		while(!gt.isEmpty()) {
			rt.push(gt.pop());
		}
		System.out.println(rt);

	}

}
