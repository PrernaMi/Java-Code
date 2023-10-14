package Recursion2;

public class Check_Target {
	
	public static boolean print(int arr[] , int x , int i) {
		if(i == arr.length) return false;
		if(arr[i] == x) return true;
		 return print(arr, x, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,7,4,87};
		int x = 4;
		boolean res = print(arr , x ,0);
		System.out.println(res);

		
	}

}
