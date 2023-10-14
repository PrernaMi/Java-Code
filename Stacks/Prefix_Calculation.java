package Stacks;

import java.util.Stack;

public class Prefix_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "-9/*+5346";
		Stack<Integer> val = new Stack<>();
		for(int i =st.length()-1 ; i >= 0 ; i--) {
			char ch = st.charAt(i);
			int ascaii = (int)ch;
			if(ascaii >= 48 && ascaii <= 57) val.push(ascaii-48);
			else {
				int v1 = val.pop();
				int v2 = val.pop();
				if(ch == '+') val.push(v1+v2);
				if(ch == '-') val.push(v1-v2);
				if(ch == '*') val.push(v1*v2);
				if(ch == '/') val.push(v1/v2);
			}
		}
		System.out.println(val.pop());

	}

}
