package Stacks;

import java.util.Stack;

public class Postfix_to_infix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "953+4*6/-";
		Stack<String> val = new Stack<String>();
		for(int i =0 ; i < st.length() ; i++) {
			char ch = st.charAt(i);
			int as = (int)ch;
			if(as >= 48 && as <= 57) val.push(ch+"");
			else {
				String v2 = val.pop();
				String v1 = val.pop();
				val.push("(" + v1+ch+v2 + ")");
			}
		}
		System.out.println(val.pop());

	}

}
