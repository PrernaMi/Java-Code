package Stacks;

import java.util.Stack;


public class ValidParanthesis {
	
	public static boolean check1(String arr[]) {
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == "(") {
				st.push('(');
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					st.pop();
				}
			}
		}
		if(st.isEmpty()) {
			return true;
		}return false;
	}
	
	public static boolean check(Stack<String> st) {
		Stack<String> st1 = new Stack<String>();
		int i = 0;
		int j =0;
		while(!st.isEmpty()) {
			if(st.pop()=="(") {
				i++;
			}else {
				j++;
			}
		}
		if(i == j) return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> st = new Stack<>();
//		st.push("(");
//		st.push(")");
//		st.push("(");
//		st.push(")");
//		st.push("(");
//		st.push(")");
		String arr[] = {"(","(",")",")"};
		boolean res = check1(arr);
		System.out.println(res);
		

	}

}
