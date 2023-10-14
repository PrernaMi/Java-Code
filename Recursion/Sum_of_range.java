package Recursion;

public class Sum_of_range {
	
	public static int sum(int a , int b) {
		if(a == b) {
			return a;
		}
		return a+sum(a+1, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int result = sum(a,b);
		System.out.println(result);
	}

}
