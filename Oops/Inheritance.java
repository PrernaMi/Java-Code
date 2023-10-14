package Oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f1 = new Fish();
		f1.fishEat();
		f1.fishSwim();
		f1.fishWalk(); 

	}

}

class Animal{
	String eat;
	String walk;
	
	void fishEat() {
		System.out.println("Fish eats...");
	}
	void fishWalk(){
		System.out.println("Fish Walks....");
	}
}

class Fish extends Animal{
	String swim;
	void fishSwim() {
		System.out.println("Fish Swims...");
	}
}
