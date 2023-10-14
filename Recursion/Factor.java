package Recursion;

public class Factor {
	
	public static int cal(int n , int i) {
		if(i == n) return 1;
		int val = cal(n, i+1);
		if(n%i == 0) {
			return val+1;
		}else return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 4;
		int i =1;
		int val = cal(a,i);
		if(val == b) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
