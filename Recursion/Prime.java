package Recursion;

public class Prime {
	
	public static boolean prime(int n , int i) {
		if(i*i > n || n == 2) {
			return true;
		}
		if(n % i == 0) {
			return false;
		}
		return prime(n, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;
		int i =2;
		boolean value = prime(n,i);
		System.out.println(value);
		

	}

}
