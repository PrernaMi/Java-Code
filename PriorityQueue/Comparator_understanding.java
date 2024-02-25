package PriorityQueue;
import java.util.*;

public class Comparator_understanding {

	public static class Student implements Comparable<Student>{
		int id;
		int wt;
		String name;
		
		Student(int id,int wt,String name){
			this.id = id;
			this.wt = wt;
			this.name = name;
		}
		
		@Override
		public int compareTo(Student o) {
			return this.wt-o.wt;
		}
		
		public String toString() {
			return "id "+id+" wt "+wt+" name "+name;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> pq = new PriorityQueue<>();
		pq.add(new Student(1, 34, "Prerna"));
		pq.add(new Student(3, 31, "Soni"));
		while(pq.size() > 0) {
			System.out.println(pq.remove());
		}

	}

}
