package Arrays;

public class Series {
	public static void print(int n , int temp , int sign) {
		if(n < 0) {
			sign = 1;
		}else if(sign == 1 && temp == n) {
			System.out.print(n);
			return;
		}
		if(sign == -1) {
			System.out.print(n+" ");
			 print(n-5, temp, sign);
		}else {
			System.out.print(n+" ");
			print(n+5, temp, sign);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;
		int temp = n;
		int sign = -1;
		print(n,temp , sign);
	}

}
