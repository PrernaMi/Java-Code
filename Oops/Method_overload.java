package Oops;

public class Method_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.sum(2.366,4.533));
		System.out.println(c1.sum(2, 4));
		System.out.println(c1.sum(1, 2,3));

	}

}
 class Calculator{
	 int sum(int a , int b) {
		 return a+b;
	 }
	 Double sum(Double a , Double b) {
		 return a+b;
	 }
	 int sum(int a , int b , int c) {
		 return a+b+c;
	 }
 }