package Recursion;

public class Product {
	
	public static int sum(int y , int x) {
		if(x == 1) {
			return y;
		}
		return y+sum(y, x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y =5;
		int min = Math.min(x, y);
		int max = Math.max(y, x);
		int result = sum(max , min);
		System.out.println(result);

	}

}
