package Arrays;

public class Rect_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1},
				{1,1,1,1,1,1}
		};
		for(int i =0 ; i < arr.length ; i++) {
			for(int j = 1; j < arr[i].length ; j++) {
				arr[i][j] += arr[i][j-1];
			}
		}
		for(int i =1 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] += arr[i-1][j];
			}
		}
		int l1 = 0;
		int l2 = 3;
		int r1 = 0;
		int r2 = 4;
		int sum = 0;
		 
//			for(int i = l1 ; i <= l2 ; i++) {
//				if(r1 >= 0 ) {
//				sum += arr[i][r2]-arr[i][r1-1];
//				}else {
//					sum += arr[i][r2];
//				}
//			}
		if(r1 != 0 && l1 != 0) {
		sum = arr[l2][r2] - arr[l2][r1-1] - arr[l1-1][r2] + 
				arr[l1-1][r1-1];
		}else if(r1 == 0 && l1 != 0){
			sum = arr[l2][r2] - arr[l1-1][r2] ;
		}else if(l1 == 0 && r1 != 0) {
			sum = arr[l2][r2] - arr[l2][r1-1] ;
		}else {
			sum = arr[l2][r2] ;
		}
		
		System.out.println(sum);

	}

}
