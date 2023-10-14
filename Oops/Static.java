package Oops;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HumanBeing h1 = new HumanBeing();
//		h1.walk();
//		h1.mobile();
		HumanBeing.mobile();
	}

}
class HumanBeing{
	int time;
	 void walk() {
		 System.out.println("Walks....");
	}
	 static void mobile() {
		 System.out.println("Calling static mehtod");
	 }
}
