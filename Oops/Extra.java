package Oops;

public class Extra {

	public static class Studentss{
		 String name;
		  int rollno;
		double percentage;
		
		//Constructor
		public Studentss(String name , int rollno , double per)  {
			this.name = name;
			this.rollno = rollno;
			this.percentage = per;
			
		}
		
	}
	public static void fun(Studentss x) {
		x.name = "Prerna";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss s1 = new Studentss("Prerna" , 34,45.3);
//		s1.name = "Sakshi";
//		s1.percentage= 23.55;
//		s1.rollno = 45;
		System.out.println(s1.name);
		//Classes is pass by reference
//		fun(s1);
//		System.out.println(s1.name);
	}
	

}

