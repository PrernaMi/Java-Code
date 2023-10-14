package Pattern;

import java.util.HashMap;

public class Pattern5 {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
		map.put(2, 3);
		map.put(4, 3);
		map.put(6, 3);
		map.put(7, 3);
		map.put(1, 3);
		System.out.println(map.get(4));
		for(int i :map.keySet()) {
			System.out.println(i+map.get(i));
		}
	}

}
