package Strings;
import java.util.*;

public class Wrong_Pattern {
	
	 public static boolean wordPattern(String pattern, String s) {
	        HashMap<Character,String> map = new HashMap<>();
	        String arr[] = s.split(" ");
	        if(pattern.length() != arr.length)return false;
	        for(int i =0 ; i < pattern.length() ; i++){
	            char ch = pattern.charAt(i);
	            String ch1 = arr[i];
	            if(!map.containsKey(ch) && !map.containsValue(ch1))map.put(ch,ch1);
	        }
	       for(int i = 0; i < pattern.length() ; i++){
	           char ch = pattern.charAt(i);
	           if(!map.containsKey(ch) || !map.get(ch).equals(arr[i])) return false;
	       }
	       return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String s = "dog dog dog dog";
		boolean res = wordPattern(pattern,s);
		System.out.println(res);

	}

}
