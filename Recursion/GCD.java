package Recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 16;
		int y = 12;
		int max = Integer.MIN_VALUE;
		int min = Math.min(x, y);
		for(int i =1 ; i <= min ; i++) {
			if(x % i == 0 && y % i == 0) {
				if(i > max) {
				  max = i;
				}
			}
		}
		System.out.println(max);

	}

}
