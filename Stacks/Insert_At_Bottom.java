package Stacks;

import java.util.Stack;

public class Insert_At_Bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> gt = new Stack<Integer>();
		st.push(3);
		st.push(6);
		st.push(7);
		st.push(4);
		st.push(1);
		while(st.size() > 2) {
			gt.push(st.pop());
		}
		gt.push(5);
		while(!gt.isEmpty()) {
			st.push(gt.pop());
		}
		System.out.println(st);

	}

}
