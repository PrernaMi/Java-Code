package Oops;

public class Hierac_Inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prerna p1 = new Prerna();
		p1.color();
		p1.eat();

	}

}

class Human{
	void eat() {
		System.out.println("All human eats...");
	}
	void walk() {
		System.out.println("All human walk..");
	}
}

class Prerna extends Human{
	void color() {
		System.out.println("Fair color..");
	}
}
class Shivani extends Human{
	void color() {
		System.out.println("Dull Color...");
	}
}