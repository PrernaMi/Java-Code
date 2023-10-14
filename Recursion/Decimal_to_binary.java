package Recursion;

public class Decimal_to_binary {
	public static int cal(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return (n%2)+10 * cal(n/2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int val = cal(n);
		System.out.println(val);

	}
}

