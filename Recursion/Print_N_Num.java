package Recursion;

public class Print_N_Num {
	
	public static void print1(int n) {
		if(n == 1) {
			System.out.print(1+" ");
			return;
		}
		print1(n-1);
		System.out.print(n+" ");
	}
	 public static int print(int n) {
		 if(n == 1) {
			 return 1;
		 }
		  int a = print(n-1);
		  System.out.println(a);
		  return n;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 System.out.println(print(n));
//		System.out.println(val);

	}

}
