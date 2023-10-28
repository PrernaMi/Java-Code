package Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int st = 1;
		int sp = n-1;
		for(int i =1;i <= n ; i++) {
			boolean flag = false;
			int count = i;
			for(int j =1 ; j <= sp ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<= st ; j++) {
				System.out.print(count);
				if(count == 1)flag = true;
				if(flag)count++;
				else count--;
			}
			System.out.println();
			sp--;
			st += 2;
		}
		int n1 = n-1;
		int c = n1;
		int sp1 = 1;//++
		int st1 = n1*2-1;//st1 -= 2
		for(int i = 1; i <= n1 ; i++) {
			boolean f = false;
			int p = c;
			for(int j = 1; j <= sp1 ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= st1 ; j++) {
				System.out.print(p);
				if(p == 1)f = true;
				if(f)p++;
				else p--;
			}
			System.out.println();
			st1-=2;
			sp1++;
			c--;
		}
	}

}
