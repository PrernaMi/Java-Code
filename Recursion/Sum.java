package Recursion;

public class Sum {
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int a = sum(n);
		System.out.println(a);

	}

}
