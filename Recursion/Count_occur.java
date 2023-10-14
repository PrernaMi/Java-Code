package Recursion;


public class Count_occur {
	public static int occur(int num) {
		if(num == 0) {
			return 0;
		}
		return (occur(num / 10)+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int a = occur(num);
		System.out.println(a);

	}

}
