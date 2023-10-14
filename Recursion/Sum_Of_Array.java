package Recursion;


public class Sum_Of_Array {
	
	public static int sum(int arr[] , int i) {
		if(i == arr.length) {
			return 0;
		}
		int val = sum(arr, i+1);
		return val+arr[i];
	}
	
	public static int sum1(int arr[],int i) {
		if(i == arr.length-1) {
			return arr[i];
		}
		int val = sum1(arr, i+1);
		return val+arr[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int index = 0;
		int val = sum1(arr,index);
//		int value = sum(arr,index);
		System.out.println(val);

	}

}
