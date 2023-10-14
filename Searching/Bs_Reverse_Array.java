package Searching;

public class Bs_Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {43,34,23,19,9,8,7};
		int target  = 89;
		int s = 0;
		int e = arr.length;
		while(s <= e) {
			int mid = s+(e-s)/2;
			if(arr[mid] == target) {
				System.out.println(mid);
				return;
			}
			else if(arr[mid] > target) {
				s = mid+1;
			}else {
				e = mid-1;
			}
		}
		System.out.println(-1);

	}

}
