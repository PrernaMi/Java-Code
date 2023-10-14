package Sorting;


public class Bubble_Sort {
	
	public static void sort(int arr[] , int n) {
		for(int i =0 ; i < n-1 ; i++) {
			for(int j = 0 ; j < n-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,25,7,84,8};
		int n = arr.length;
		sort(arr , n);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
