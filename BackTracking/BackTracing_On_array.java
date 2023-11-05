package BackTracking;

public class BackTracing_On_array {
	
	public static void print(int arr[],int i,int val) {
		if(i == arr.length) {
			return;
		}
		arr[i] = val;
		print(arr, i+1, val+1); // Recursion Step
		arr[i]-=2; // Backtracking Step
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		print(arr,0,1);
		for(int i =0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
