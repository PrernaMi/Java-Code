package OOPS1;

public class Runtime_poly {
      public static void main(String[]args) {
    	  Cat c1 = new Cat();
    	  c1.bark();
      }
}

 class Dog{
	void bark() {
		System.out.println("Bark");
	}
}
 class Cat extends Dog{
	 void bark() {
			System.out.println("Meow");
		}
 }
