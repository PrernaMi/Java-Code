package Sheet_ans;

public class Row_With_Max_One {

	public static int count(int arr[][] , int n , int m) {
		int idx = -1;
		int fin = Integer.MIN_VALUE;
		for(int i =0 ; i < n ; i++) {
			int res = 0;
			for(int j = 0 ; j < m ; j++) {
				if(arr[i][j] == 1) res++;
			}
			if(res > fin) {
				fin = res;
				idx = i;
			}
		}
		return idx;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{0,1,1},
				{1,1,1},
				{1,1,1}
		};
		int n = arr.length;
		int m = arr[0].length;
		int fin = Integer.MIN_VALUE;
		int result = count(arr,n,m);
		System.out.println(result);

	}

}
