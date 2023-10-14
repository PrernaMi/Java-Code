package Sorting;

public class Selection_Sort {
	
	public static void sort(int arr[] , int n) {
		int min = -1;
		for(int i =0 ; i < n ; i++) {
			 min = i;
			 for(int j = i+1 ; j < n-1; j++) {
				 if(arr[j] < arr[min]) {
					 min = j;
				 }
			 }
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,6,2,8};
		int n = arr.length;
		sort(arr,n);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
