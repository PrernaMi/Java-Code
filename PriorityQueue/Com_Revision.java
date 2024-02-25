package PriorityQueue;

import java.util.PriorityQueue;

public class Com_Revision {

	public static class Students implements Comparable<Students>{
		int rn;
		String name;
		int ht;
		int wt;
		
		Students(int rn,String name,int ht,int wt){
			this.rn = rn;
			this.name = name;
			this.ht = ht;
			this.wt = wt;
		}
		
		@Override
		public int compareTo(Students o) {
			return this.ht - o.ht;
		}
		
		public String toString() {
			return "rn "+rn+" name "+name+" ht "+ht+" wt "+wt;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Students> pq = new PriorityQueue<>();
		pq.add(new Students(67, "Prerna", 3, 45));
		pq.add(new Students(33, "Soniya", 5, 79));
		pq.add(new Students(6227, "aabg", 7, 43));
		pq.add(new Students(2, "rgjuw", 2, 47));
		while(pq.size()>0) {
			System.out.println(pq.remove());
		}

	}

}
