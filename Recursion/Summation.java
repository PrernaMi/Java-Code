package Recursion;

public class Summation {
	public static int sum(int n , int m) {
		if(n == 0) {
			return 0;
		}
		if(m == 1) {
			return sum(n-1, m)+n;
		}else {
			return sum(sum(n, m-1), 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 1;
		int val =sum(n,m);
		System.out.println(val);

	}

}
