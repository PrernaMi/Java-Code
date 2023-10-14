package Oops;


public class Shallow_Deep_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name = "Prerna";
		e1.marks[0] = 57;
		e1.marks[1] = 65;
		e1.marks[2] = 68;
		
		Employee e2 = new Employee(e1);
		e2.name = "neha";
		e1.marks[0] = 87;
		e2.marks[1] = 99;
		for(int i =0; i < 3 ; i++) {
			System.out.println(e2.marks[i]);
		}
		System.out.println(e2.marks[0]);//No Change
		System.out.println(e1.marks[1]);//Change
		
}

}

class Employee{
	String name;
	int marks[];
	
	//Shallow Copy Constructor
//	Employee(Employee e1){
//		this.name = name;
//		marks = new int[3];
//		this.marks = e1.marks;
//		
//	}
	
	//Deep copy constructor
	
	Employee(Employee e1){
		this.name = name;
		marks = new int[3];
		for(int i =0 ; i < 3 ; i++) {
			this.marks[i] = e1.marks[i];
		}
	}
	 Employee() {
		 marks = new int[3];
		 }
	
	
}
