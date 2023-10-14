package Recursion;

public class Print_N_To_1 {
	
	public static void print(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n);

	}

}
