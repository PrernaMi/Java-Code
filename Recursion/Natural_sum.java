package Recursion;

public class Natural_sum {
	
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		if(n % 2 == 0) {
			return sum(n-1)-n;
		}else {
		return sum(n-1)+n;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int val = sum(n);
		System.out.println(val);

	}

}
