package Pattern;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int st = 1;
		for(int i =1 ; i <= n ;i++) {
			for(int j = 1; j <= st ; j++) {
				System.out.print("*");
			}
			System.out.println();
			st++;
		}
		int n1 = n-1;
		int st1 = n-1;
		for(int i = 1; i <= n1 ; i++) {
			for(int j = 1; j <= st1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
			st1--;
		}

	}

}
