package Sorting;

public class Merge_Sort {
	
	public static void merge(int arr[] , int l , int mid , int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int []left = new int[n1];
		int []right = new int[n2];
		for(int i =0 ; i < n1 ; i++) {
			left[i] = arr[l+i];
		}
		for(int j =0 ; j < n2 ; j++) {
			int o = mid+1;
			right[j] = arr[o+j];
		}
		int i = 0;
		int j = 0;
		int k =  l;
		while(i < n1 && j < n2) {
			if(left[i] < right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++] = right[j++];
			}
		}
		while(i < n1) {
			arr[k++] = left[i++];
		}
		while(j < n2 ) {
			arr[k++] = right[j++];
		}
}
	
	public static void mergeSort(int arr[] , int l , int r) {
		if(l >= r) return;
		 int mid = (l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		merge(arr,l,mid,r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,20,2,11,8};
		int n = arr.length;
		mergeSort(arr,0,n-1);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
