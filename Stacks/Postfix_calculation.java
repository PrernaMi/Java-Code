package Stacks;

import java.util.Stack;

public class Postfix_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "953+4*6/-";
		Stack<Integer> val = new Stack<>();
		for(int i =0 ; i < st.length() ; i++) {
			char ch = st.charAt(i);
			int ascaii = (int)ch;
			if(ascaii >= 48 && ascaii <= 57) val.push(ascaii-48);
			else {
				if(ch == '+') {
					int v2 = val.pop();
					int v1 = val.pop();
					val.push(v1+v2);
				}
				if(ch == '-') {
					int v2 = val.pop();
					int v1 = val.pop();
					val.push(v1-v2);
				}
				if(ch == '*') {
					int v2 = val.pop();
					int v1 = val.pop();
					val.push(v1*v2);
				}
				if(ch == '/') {
					int v2 = val.pop();
					int v1 = val.pop();
					val.push(v1/v2);
				}
			}
		}
		System.out.println(val.pop());

	}

}
