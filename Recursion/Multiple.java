package Recursion;

public class Multiple {
	
	public static void print(int num , int k) {
		if(k == 1) {
			System.out.print(num * k+" ");
			return;
		}
		 print(num, k-1);
		 System.out.print(num*k+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int k = 6;
		print(num,k);

	}

}
