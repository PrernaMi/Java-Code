package Sorting;

public class SwapInSorted {
	
	public static void swap(int arr[]) {
		if(arr.length == 1) {
			return;
		}
		int x =-1;
		int y =-1;
		for(int i =0 ; i < arr.length-1 ; i++) {
			if(arr[i+1] - arr[i] < 0) {
				if(x == -1) x=i;
				else y = i+1;
			}
		}
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {51};
		swap(arr);

	}

}
