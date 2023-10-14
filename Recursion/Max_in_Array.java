package Recursion;

public class Max_in_Array {
	
	public static int max(int arr[] , int index , int maxi) {
		//Base Case
		if(index == arr.length-1) {
			maxi = Math.max(maxi, arr[index]);
			return maxi;
		}
		//Self Work
		maxi = Math.max(maxi, arr[index]);
		//Subproblem
		return max(arr,index+1,maxi);
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,2,56};
		int index = 0;
		int min = Integer.MIN_VALUE;
		int cal =max(arr,index,min);
		System.out.println(cal);

	}

}
