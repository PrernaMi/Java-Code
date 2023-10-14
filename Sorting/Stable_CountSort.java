package Sorting;

public class Stable_CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,3,4,2,3,5,3,2,2,5};
		int n  = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i =0 ; i < n ; i++) {
			max = Math.max(max, arr[i]);
		}
		int count[] = new int[max+1];
		for(int i = 0; i < n ; i++) {
			count[arr[i]]++;
		}
		for(int i =1 ; i < count.length ; i++) {
			count[i] += count[i-1];
		}
		int newarr[] = new int[n];
		for(int i = n-1 ; i >= 0 ; i--) {
			int val = arr[i];
			newarr[count[val]-1] = val;
			count[val]--;
		}
		for(int i : newarr) {
			System.out.print(i+" ");
		}
	}

}
