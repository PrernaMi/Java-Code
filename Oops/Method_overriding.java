package Oops;

public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animl a1 = new Animl();
		a1.eat();
		Deer d1 = new Deer();
		d1.eat();

	}

}

class Animl{
	void eat() {
		System.out.println("eat Anything");
	}
}
class Deer extends Animl{
	void eat() {
		System.out.println("Eat Grass");
	}
}
