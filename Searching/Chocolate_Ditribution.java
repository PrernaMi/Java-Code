package Searching;

public class Chocolate_Ditribution {
	
	public static boolean isvalid(int arr[] , int n , int m , int max) {
		if(arr[0] > max) return false;
		int st =1;
		int sum =0;
		for(int i =0 ; i < n ; i++) {
			sum += arr[i];
			if(sum > max) {
				st++;
				sum = arr[i];
			}
		}
		if(st > m) return false;
		return true;
	}
	
	public static int bs(int arr[] , int n , int m , int s , int e) {
		int ans =-1;
		while(s <= e) {
			int mid = s+(e-s)/2;
			boolean res = isvalid(arr,n,m,mid);
			if(res == true) {
				ans = mid;
				e = mid-1;
			}else {
				s = mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,12,12,12};
		int n = arr.length;
		int m = 2;
		int maxi = Integer.MIN_VALUE;
		for(int i = 0; i < n ; i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		int s = maxi;
		int sum =0;
		for(int i =0 ; i < n ; i++) {
			sum+=arr[i];
		}
		int e = sum;
		int ans = bs(arr,n,m,s,e);
		System.out.println(ans);

	}

}
