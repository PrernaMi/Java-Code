package Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
		int st = 1;
		for(int i =1 ; i <= n ; i++) {
			int count = i;
			for(int j = 1; j <= st ; j++) {
				System.out.print(count+" ");
				if(j < i) count++;
				else count--;
			}
			System.out.println();
			st+=2;
		}
		

	}

}
