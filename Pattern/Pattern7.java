package Pattern;

public class Pattern7 {
	public static void main(String[]args) {
		int n = 4;
		int st =1 ;
		for(int i = 1; i <= n ; i++) {
			int count = 1;
			for(int j = 1; j <= st ; j++) {
				System.out.print(count);
				count++;
			}
			st++;
			System.out.println();
		}
	}

}
