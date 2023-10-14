package Recursion;

public class Perfect {
	
	public static int check(int n , int i) {
		if(i == n) {
			return 0;
		}
		int val = check(n, i+1);
		if(n%i == 0) {
			return i+val;
		}else return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		int n = 1;
		int i = 1;
		int val = check(n,i);
		if(val == n) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
