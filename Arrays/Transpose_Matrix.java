package Arrays;

public class Transpose_Matrix {
	public static void transpose(int arr[][] , int n , int c[][]) {
		for(int i =0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i != j) {
					c[j][i] = arr[i][j];
				}else {
					c[i][j] = arr[i][j];
				}
			}
		}
	}
	
	public static void print(int c[][] , int n) {
		for(int i =0 ; i < n ; i++) {
			for(int j =0 ; j < n ; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void transpose2(int arr[][] , int n) {
		for(int i =0 ; i < n ; i++) {
			for(int j =0 ; j < n ; j++) {
				if(i != j && i < j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		print(arr, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{4,6},
				{4,8},
		};
		int n = arr.length;
		int c[][] = new int[arr.length][arr[0].length];
//		transpose(arr,n,c);
//		print(c,n);
		transpose2(arr,n);
//		print(arr,n);

	}

}
