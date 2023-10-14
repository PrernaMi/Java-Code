package Recursion;

public class Powerd {
	
	public static boolean isPowerOfTwo(int n) {
		if(n == 1) return true;
		if(n == 0 ) return false;
        boolean res = (n%10 == 0) && isPowerOfTwo(n/2);
        return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32;
		boolean res = isPowerOfTwo(n);
		System.out.println(res);

	}

}
