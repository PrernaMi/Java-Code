package Stacks;
import java.util.*;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		 Stack<Character> st = new Stack<>();
	        if(s.length() == 1) return;
	        for(int i =0 ; i < s.length() ; i++){
	            char ch = s.charAt(i);
	            if(ch == '(') st.push('(');
	            else if(ch == ')' && !st.isEmpty() && st.peek() == '(') st.pop();
	            if(ch == '{') st.push('{');
	            else if(ch == '}' && !st.isEmpty() && st.peek() == '{') st.pop();
	            if(ch == '[') st.push('[');
	            else if(ch == ']' && !st.isEmpty() && st.peek() == '[') st.pop();else{
	                st.push(ch);
	            }
	        }
        if(st.isEmpty()) System.out.println("true");
        else {
			System.out.println(false);
		}

	}

}
