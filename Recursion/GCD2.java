package Recursion;

public class GCD2 {
	
	public static int gcd(int x , int y) {
		if(y == 0) {
			return x;
		}
		if(x == 0) {
			return y;
		}
		return gcd(y, x%y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 16;
		int y = 12;
		int val = gcd(x,y);
		System.out.println(val);

	}

}
