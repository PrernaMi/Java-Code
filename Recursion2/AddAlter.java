package Recursion2;
import java.util.*;
public class AddAlter {
	
	public static String merge(String S1, String S2)
    { 
        // code here
        if(S1.length() == 0) return S2;
        if(S2.length() == 0) return S1;
        if(S1.length() == 0 && S2.length() ==0) return "";
        char c1 = S1.charAt(0);
        char c2 = S2.charAt(0);
        String s = Character.toString(c1)+Character.toString(c2);
        String se = merge(S1.substring(1) , S2.substring(1));
        return s+se;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Hello";
		String S2 = "Bye";
		String st = merge(S1,S2);
		System.out.println(st);
		

	}

}
