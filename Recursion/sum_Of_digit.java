package Recursion;

public class sum_Of_digit {
	public static int digit(int num) {
		if(num== 0) {
			return 0;
		}
		return digit(num/10)+num % 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int sum =0;
		System.out.println(digit(n));

	}

}
