package BackTracking_1;

public class Grid_ways_Optimize {
	
	public static int fact(int n) {
		if(n == 0)return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 3;
		int a = fact(n-1+m-1);
		int b = fact(n-1)*fact(m-1);;
		int res = a/b;
		System.out.println(res);

	}

}
