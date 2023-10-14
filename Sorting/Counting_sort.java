package Sorting;

public class Counting_sort {
	
	public static void counting(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			max = Math.max(max, i);
		}
		int count[] = new int[max+1];
		for(int i : arr) {
			count[i]++;
		}
		int k =0;
		for(int i = 0; i < count.length ; i++) {
			while(count[i] != 0) {
				arr[k++] = i;
				count[i]--;
			}
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,2,3,1,2,5,8,8,6};
		counting(arr);

		
	}

}
