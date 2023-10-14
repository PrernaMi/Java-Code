package Sorting;

public class Insertion_Sort {
	public static void sort(int arr[] , int n) {
		for(int i =1 ; i < n ; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > arr[j+1]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,6,3,6,8};
		int n = arr.length;
		sort(arr,n);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
