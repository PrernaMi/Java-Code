package Oops;

import java.security.PublicKey;

public class Multiple_inhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beer b1 = new Beer();
		b1.eatgrass();
		b1.eatmeat();

	}

}

interface Harbivore{
	void eatgrass();
}
interface Carnivore{
	void eatmeat();
}

class Beer implements Harbivore , Carnivore{
	public void eatgrass() {
		System.out.println("Eat grass");
	}
	public void eatmeat() {
		System.out.println("eat Meat");
	}
}