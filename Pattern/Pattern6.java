package Pattern;

public class Pattern6 {
	public static void main(String[]args) {
		int n = 7;
		int st = 1;
		int sp =0;
		for(int i =1 ; i <= n ; i++) {
			for(int j =1 ; j <= sp ; j++) {
				System.out.print(" ");
			}
			for(int j =1 ; j <= st ; j++) {
				System.out.print("*");
			}
			System.out.println();
			st++;
			sp++;
		}
		int st1 = n-1;
		int sp1 = n-1;
		for(int i = 1; i <= n-1 ; i++) {
			for(int j =1 ; j <= sp1 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= st1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
			st1--;
			sp1--;
		}
	}

}
