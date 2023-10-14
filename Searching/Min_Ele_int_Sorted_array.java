package Searching;

public class Min_Ele_int_Sorted_array {
	
	public static int search(int arr[]) {
		int n = arr.length;
		int s = 0;
		int e = arr.length-1;
		int ans = -1;
		while(s <= e) {
			int mid = s+(e-s)/2;
			if(arr[mid] > arr[n-1]) {
				s = mid+1;
			}else if(arr[mid] <= arr[n-1]) {
				ans = mid;
				e = mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {10,11,12,1,2,3,4,5,6,7,8,9};
		int index = search(arr);
		System.out.println(index);
	}

}
