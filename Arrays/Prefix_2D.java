package Arrays;

public class Prefix_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n = arr.length;
		int m = arr[0].length;
		for(int i =0 ; i < n ; i++) {
			for(int j =1 ; j < m ; j++) {
				arr[i][j] += arr[i][j-1];
			}
		}
		for(int j = 0; j < m ; j++) {
			for(int i = 1; i < n ; i++) {
				arr[i][j] += arr[i-1][j];
			}
		}
		for(int i =0 ; i <  n ; i++) {
			for(int j =0 ; j < m ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
