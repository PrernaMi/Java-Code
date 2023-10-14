package Oops;

public class Multi_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d1 = new Dogs();
		d1.leg = 4;
		System.out.println(d1.leg);
		d1.eat();
		d1.legs();
		d1.breadth();
		d1.breed();

	}

}

class Animals{
	void eat() {
		System.out.println("Animal Eats....");
	}
	void breadth() {
		System.out.println("Animal Breadth...");
	}
}
class Mammels extends Animals{
	int leg;
	void legs() {
		System.out.println("They Have Four legs...");
	}
}
class Dogs extends Mammels{
	void breed() {
		System.out.println("Dogs Hava Diiferent breed..");
	}
}
