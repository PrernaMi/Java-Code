package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Quart_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,3,4,5,7,8};
		int K = 23;
		int n = 7;
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> l1 = new ArrayList<ArrayList<Integer>>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : arr) set.add(i);
		for(int i =0 ; i < n-3; i++) {
			for(int j = i+1 ; j < n-2 ; j++) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int k = j+1 ; k < n ; k++) {
					int res = K-(arr[i]+arr[j]+arr[k]);
					if(set.contains(res) && arr[i] != res && arr[j] != res && arr[k] != res) {
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						list.add(res);
					}
				}
			}
		}
		System.out.println(l1);
	}

}
