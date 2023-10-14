package Hashing;

import java.util.HashMap;

public class Count_Ferq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		for(int i : map.keySet()) {
			System.out.println(i+" "+ map.get(i));
		}

	}

}
