package Recursion;

public class Table {

	public static void table(int a , int i) {
		if(i == 10) {
			System.out.println(a*i);
			return;
		}
		System.out.println(a*i);
		table(a, i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int i = 1;
		table(a,i);
	}

}
