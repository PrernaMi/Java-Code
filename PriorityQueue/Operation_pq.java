package PriorityQueue;

import java.util.PriorityQueue;

public class Operation_pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(7);
		pq.add(45);
		pq.add(1);
		pq.add(33);
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());

	}

}
