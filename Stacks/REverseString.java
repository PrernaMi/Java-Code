package Stacks;

import java.util.Stack;

public class REverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "i.like.this.program.very.much";
		 Stack<Character> st = new Stack<Character>();
	        StringBuilder sb = new StringBuilder("");
	        for(int i =0 ; i < S.length() ; i++ ){
	            char ch = S.charAt(i);
	            if(ch != '.'){
	                st.push(ch);
	            }else{
	                while(!st.isEmpty()){
	                    sb.append(st.pop());
	                }
	            }
	            if( st.isEmpty()){
	                sb.append(".");
	            }
	        }
	        while(!st.isEmpty()) {
	        	sb.append(st.pop());
	        }
		System.out.println(sb);

	}

}
