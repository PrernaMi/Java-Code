package Arrays;

public class UpperPart_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int n = arr.length;
		for(int i =0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < arr[0].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
