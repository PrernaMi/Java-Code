package Recursion2;

public class AddAll {
	
	public static int[] print(int arr[] , int i) {
		if(i == arr.length) {
			return new int[i];
		}
		int arri[] = print(arr, i+1);
		arri[i] = arr[i];
		return arri;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3};
		int i =0;
		int arr[] = print(arr1 ,i);
		for(int j: arr) {
			System.out.print(j+" ");
		}

	}

}
