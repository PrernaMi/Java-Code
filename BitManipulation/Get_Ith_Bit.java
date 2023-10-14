package BitManipulation;

public class Get_Ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 72;
		int i = 2;
		int result = n & ( 1 << i);
		if(result == 0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}

	}

}
