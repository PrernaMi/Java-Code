package Recursion;
public class Replace {
	
	public static int change(int n){
		if(n/10 == 0) {
			return n%10;
		}
		int val = change(n/10);
		if(n%10 == 0) {
			return val*10+1;
		}else {
			return val*10+(n%10);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30106;
		int num = change(n);
		System.out.println(num);
	}

}
