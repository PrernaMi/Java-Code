package Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//		int count =0;
		int st = n;
		for(int i =1 ; i <= n; i++) {
			int count =i;
			for(int j = 1; j <= st ; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
			st--;
		}

	}

}
