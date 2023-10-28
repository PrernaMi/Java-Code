package Pattern;

public class Pattern10 {

	public static void main(String[]args) {
		int n = 4;
		int st = 1;
		int sp = n-1;
		for(int i =1 ; i <= n ; i++) {
			for(int j = 1; j <= sp ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= st ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			sp--;
			st++;
		}
		int sp1 = 1;
		int st1 = n-1;
		for(int i =1 ; i <= n-1 ; i++) {
			for(int j =1 ; j <= sp1 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= st1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
			st1--;
			sp1++;
		}
	}
}
