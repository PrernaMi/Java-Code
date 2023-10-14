package Recursion;

public class fibonacci {
	
	public static int fibo(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		else {
			return(fibo(n-1) + fibo(n-2)) ;
		}
		
	}
     
	public static void fib(int a , int b , int n) {
		if(n == 0) {
			return;
		}
		int c = a+b;
		System.out.print(c+" ");
		fib(b,c,n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//		System.out.print(a+" "+b);
//		for(int i =0 ; i < n ; i++) {
//			System.out.print(fibo(i)+" ");
//		}
	 int a = 0;
	 int b = 1;
	 System.out.print(a+" "+b+" ");
	 fib(a,b,n-2);

	}

}
