package Recursion2;

public class ArrayPrint {
	
	public static void print(int arr[] , int i) {
		if(i == arr.length-1) {
			System.out.print(arr[i]+" ");
			return;
		}
		System.out.print(arr[i]+" ");
		print(arr, i+1);
		
	}
	
	public static void reverse(int arr[] , int i) {
		if(i == arr.length-1) {
			System.out.print(arr[i]+" ");
			return;
		}
		reverse(arr, i+1);
		System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5};
		int i =0;
//		print(arr , i);
		reverse(arr,i);

	}

}
