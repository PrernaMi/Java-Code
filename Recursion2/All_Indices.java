package Recursion2;

public class All_Indices {
	public static int[] print(int arr[] , int x ,int i , int f) {
		if(i == arr.length) {
			   return new int[f];
			}
		if(arr[i] == x) {
			f = f+1;
		}
		int arri[] = print(arr, x, i+1, f);
		if(arr[i] == x) {
			arri[f-1] = i;
		}
		return arri;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,2,5,7,3,2,3,2};
		int x = 2;
		int i = 0;
		int f = 0;
		int arr1[] = print(arr, x , i,f);
		for(int j =0 ; j < arr1.length ; j++) {
			System.out.println(arr1[j]);
		}

	}

}
