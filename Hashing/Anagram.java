package Hashing;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "silentty";
		String s2 = "listeni";
		if(s1.length() != s2.length()) return;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i =0 ; i < s1.length() ; i++) {
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		}
		for(int i =0 ; i < s2.length() ; i++) {
			map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
		}
		for(int i =0 ; i < s1.length() ; i++) {
			char ch = s1.charAt(i);
			int j = map1.get(ch);
			if(map2.containsKey(ch)) {
				if(map2.get(ch) != j) {
					System.out.println("false");
					return;
				}
			}
		}
		System.out.println("true");

	}

}
