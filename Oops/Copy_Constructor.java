package Oops;


public class Copy_Constructor {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "Prerna";
		s1.password = "abcd";
		s1.marks[0] = 20;
		s1.marks[1] = 23;
		s1.marks[2] = 46;
 
		System.out.println(s1.name);
		System.out.println(s1.password);
		Students s2 = new Students(s1);
		s2.password = "xyz";
		System.out.println(s2.password);
		for(int i = 0 ; i < 3; i++) {
			System.out.println(s2.marks[i]);
		}
		s1.marks[1] = 100;
		s2.marks[0] = 50;
		System.out.println(s1.marks[0]);
		System.out.println(s2.marks[1]);
	}

}

class Students{
	String name;
    String password;
    int marks[];
 
    Students(Students s1){
    	marks = new int[3];
    	this.name = s1.name;
    	this.password = s1.password;
    	this.marks = s1.marks;
    	
    }
      Students() {
    	  marks = new int[3];
	}
     
}
