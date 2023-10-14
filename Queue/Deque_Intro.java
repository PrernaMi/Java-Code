package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.addFirst(3);
		dq.addFirst(4);
		dq.addFirst(5);
		dq.addLast(6);
		System.out.println(dq);
		System.out.println(dq.getFirst());

	}

}
