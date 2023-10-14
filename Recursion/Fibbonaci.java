package Recursion;

public class Fibbonaci {
	public static int fibo(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int num  =  fibo(n);
		System.out.println(num);

	}

}
