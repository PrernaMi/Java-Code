package Recursion2;

public class Both {
	
	public static void increasing(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		increasing(n-1);
		System.out.println(n);
	}
	
	public static void decreasing(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		decreasing(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		decreasing(n);
		increasing(n);

	}

}
