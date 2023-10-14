package Recursion;

public class Power1 {
	
	public static int pow(int a , int b) {
		if(b == 0) {
			return 1;
		}
		int val = pow(a, b/2);
		if(b % 2 == 0) {
			return val*val;
		}else {
			return a*val*val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 5;
		int val = pow(a,b);
		System.out.println(val);

	}

}
