package Arrays;

public class Abs_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int x = 0;
		for(int i =0 ; i < n ; i++) {
			for(int j = i+1 ; j < n-1 ; j++) {
				if(Math.abs(arr[i]-arr[j]) == x) {
					System.out.print(true);
					return;
				}
			}
		}
		System.out.print(false);

	}

}
