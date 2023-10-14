package Searching;

public class Search_In_Duplicate_array {
	
	public static int fun(int arr[]) {
		int s =0;
		int e = arr.length-1;
		int target = 3;
		while(s <= e) {
			int mid = s+(e-s)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] == arr[s] && arr[mid] == arr[e]) {
					s++;
					e--;
				}
			else if(arr[mid] < arr[e]) {
					if(arr[mid] < target && arr[e] >= target) {
						s = mid+1;
					}else {
						e = mid-1;
					}
				}else {
					if(arr[mid] > target && arr[s] <= target) {
						e = mid-1;
					}else {
						s = mid+1;
					}
				}
			}
			
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,2,2,3,1};
		int index = fun(arr);
		System.out.println(index);

	}

}
