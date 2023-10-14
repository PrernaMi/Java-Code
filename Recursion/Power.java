package Recursion;

public class Power {
	
	public static int power(int p , int q) {
		if(q == 0) {
			return 1;
		}
		if(q %2 == 0) {
			return power(p, q/2) * power(p, q/2);
		}else {
			return power(p, q/2) * power(p, q/2) *p;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 2;
		int q =5;
		int val = power(p,q);
		System.out.println(val);

	}

}
