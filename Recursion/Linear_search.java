package Recursion;

public class Linear_search {
	
	public static int print(int arr[] , int i , int x) {
		if(arr[i] == x) {
			return i;
		}
		if(i == arr.length-1) {
			return -1;
		}
		return print(arr, i+1, x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,7,4,9};
		int x = 98;
		int index = 0;
		int result = print(arr,index,x);
		System.out.println(result);

	}

}
