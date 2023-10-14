package Hashing;

import java.util.HashMap;

public class High_Low_Freq {
	
	public static void main(String args[]) {
		int arr[] = {2,2,3,4,4,2};
		HashMap<Integer , Integer> map = new HashMap<Integer, Integer>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int a = 0;
		int b =0;
		for(int i : map.keySet()) {
			if(map.get(i) > max) {
				max = map.get(i);
				a = i;
			}if(map.get(i) < min) {
				b = i;
				min = map.get(i);
			}
		}
		System.out.println(a+" "+b);
	}

}
