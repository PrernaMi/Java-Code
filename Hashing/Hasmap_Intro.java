package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hasmap_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("India", 233);
		map.put("China", 6476);
		map.put("US", 36);
//		System.out.println(map.get("India"));
//		for(Map.Entry<String, Integer> e : map.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		

	}

}
