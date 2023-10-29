package BackTracking_1;

public class Array {
	
	public static void backtracking(int arr[],int i,int n) {
		if(i == n) {
			return;
		}
		arr[i] = i+1; 
		backtracking(arr, i+1, n);// Recursive Step
		arr[i] -= 2; // Backtracking Step
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		backtracking(arr,0,arr.length);
		for(int i : arr)System.out.print(i+" ");

	}

}
