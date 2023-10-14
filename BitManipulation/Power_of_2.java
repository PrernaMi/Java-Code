package BitManipulation;

public class Power_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		int res = n&(n-1);
		if( res == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
