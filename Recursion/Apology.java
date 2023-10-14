package Recursion;

public class Apology {
	public static void print(int n) {
		if(n == 1) {
			System.out.println("Sorry");
			return;
		}
		System.out.println("Sorry");
		print(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		print(n);

	}

}
