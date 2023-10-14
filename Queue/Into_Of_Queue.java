package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Into_Of_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.peek());
		System.out.println(q+" ");
		q.remove();
		System.out.println(q+" ");
		if(!q.contains(6))  System.out.println("Hello");
		q.removeAll(q);
		System.out.println(q+" ");
	}

}
