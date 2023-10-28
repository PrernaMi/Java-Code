package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 4;
		int n = 4;
		n = 2*n-2;
		for(int i =0 ; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				int count = o-Math.min(Math.min(i, j), Math.min(n-i, n-j));
				System.out.print(count);
			}
			System.out.println();
		}

	}

}
