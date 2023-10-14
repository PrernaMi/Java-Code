package Recursion;

public class Array_print {
	public static void print(int arr[] , int index) {
		if(index == arr.length-1) {
			System.out.print(arr[index]);
			return;
		}
		System.out.print(arr[index]+" ");
		print(arr, index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int index =0;
		print(arr,index);

	}

}
