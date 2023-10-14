package Oops;


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method Overloading
		Student s1 = new Student();
		
		Student s2 = new Student("Prerna");
		System.out.println(s2.name);
		
		Student s3 = new Student("Prerna",123);
		System.out.println(s3.name);
		System.out.println(s3.rollno);

	}

}

class Student{
	String name;
	int rollno;
	
	Student(){
		System.out.println("Constructor is Called...");
	}
	Student(String name){
		this.name = name;
	}
	Student(String name , int roll){
		this.name = name;
		this.rollno = roll;
	}
}
