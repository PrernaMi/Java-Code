package Recursion;

public class Armstrng_Num {
	
	public static int amostrong(int num , int c ) {
		if(num >= 1 && num <= 9) {
			return num*num*num;
		}
		int val = amostrong(num/10, c);
		 return val+(int)Math.pow(num%10, c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345;
		int num1 = num;
		int count =0;
		while(num1 != 0) {
			count++;
			num1 /= 10;
		}
		int value = amostrong(num,count);
		if(value == num) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
