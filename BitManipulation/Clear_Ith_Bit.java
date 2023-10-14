package BitManipulation;

public class Clear_Ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int i = 2;
		int bitamsk = ~(1 << i);
		System.out.println(n & bitamsk);

	}

}
