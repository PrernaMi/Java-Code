package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Printelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(5);
		q.add(6);
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			qu.add(q.remove());
		}
		while(!qu.isEmpty()) {
			q.add(qu.remove());
		}
		System.out.println();
		System.out.println(q);
		

	}

}
