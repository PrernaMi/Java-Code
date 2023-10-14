package Sorting;
public class QuickSort {
	
	static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low >= high) return;
        int pi = partition(arr,low ,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int count = 0;
        for(int i = low+1 ; i <= high ; i++){
            if(arr[i] <= pivot) {
            	count++;
            }
        }
        int pi = count+low;
        swap(arr,low,pi);
        int i = low;
        int j = high;
        while(i < pi && j > pi){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pi && j > pi){
                swap(arr,i,j);
            }
            i++;
            j--;
        }
        return pi;
    } 
	
	public static void quicksort(int arr[],int s , int e) {
		if(s >= e) return;
		int pi = partition(arr,s,e);
		quicksort(arr, s, pi-1);
		quicksort(arr, pi+1, e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,7,34,5};
		quickSort(arr,0,arr.length-1);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
