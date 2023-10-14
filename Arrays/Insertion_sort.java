package Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,54,7,5,887,7};
		int n = arr.length;
		for(int i =1 ; i < n ; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		for(int k : arr) {
			System.out.println(k);
		}

	}

}
