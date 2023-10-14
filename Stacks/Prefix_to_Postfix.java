package Stacks;

import java.util.Stack;

public class Prefix_to_Postfix {
	public static void main(String[] args) {
		String st = "-9/*+5346";
		Stack<String> val = new Stack<String>();
		for(int i = st.length()-1 ; i >= 0 ; i--) {
			char ch = st.charAt(i);
			int as = (int)ch;
			if(as >= 48 && as <= 57) {
				val.push(ch+"");
			}else {
				String v1 = val.pop();
				String v2 = val.pop();
				val.push(v1+v2+ch);
			}
		}
		System.out.println(val.pop());
	}

}
