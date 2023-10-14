package Recursion;

public class GCD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 16;
		int y = 12;
		int min = Math.min(x, y);
		x = Math.max(x, y);
	    
		while(min != 0) {
			int temp = min;
			min = x % min;
			x = temp;
		}
		System.out.println(x);
		

	}

}
