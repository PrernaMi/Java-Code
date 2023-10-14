package Oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken c1 = new Chicken();
		c1.eat();
		c1.walk();

	}

}

abstract class Animales{
	void eat() {
		System.out.println("Animal Eats..");
	}
	abstract void walk();
}

class Horse extends Animales{
	void walk() {
		System.out.println("walks on 4 legs");
	}
}

class Chicken extends Animales{
	void walk() {
		System.out.println("Walk on 2 legs");
	}
}
