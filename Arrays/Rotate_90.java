package Arrays;

public class Rotate_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int n = arr.length;
		for(int i =0 ; i < n ; i++) {
			for(int j = 0; j < n ; j++) {
				if(i != j && i < j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		for(int i =0 ; i < n ; i++) {
			int j =0;
			int k = n-1;
			while(j < k) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
				j++;
				k--;
			}
		}
		for(int i =0 ; i < n ; i++) {
			for(int j =0 ; j < n ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
