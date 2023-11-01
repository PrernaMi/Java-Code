package Arrays;

import java.util.HashMap;

public class Frequency_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,5,3};
		int n = 5;
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < n ; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

//		for(int i : map.keySet()) {
//			System.out.print(i+" "+map.get(i));
//			System.out.println();
//		}
		for(int i = 0 ; i < n ; i++) {
			if(map.containsKey(i+1)) {
				arr[i] = map.get(i+1);
			}else {
				arr[i] = 0;
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
