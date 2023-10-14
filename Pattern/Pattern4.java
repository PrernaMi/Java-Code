package Pattern;

public class Pattern4 {

	public static void main(String [] args) {
		int n = 4;
		int st = 1;
		int count =1;
		int k = 0;
		for(int i =1 ; i <= n ; i++) {
			if(i != 1) count += k;
			int a = count;
			for(int j =1 ; j <= st ; j++) {
				System.out.print(a);
				if(j < i) a++;
				else if(j == i) continue;
				else a--;
			}
			System.out.println();
			st+=3;
			k++;
		}
	}
}
