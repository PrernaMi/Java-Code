package Recursion;

public class PrimeV {
	
	public static boolean prime(int n , int i) {
		if(n == 2 || i == n) {
			return true;
		}
		if(n%i == 0) {
			return false;
		}
		return prime(n, i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int i = 2;
		boolean val = prime(n,i);
		System.out.println(val);

	}

}
