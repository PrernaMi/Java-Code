package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class print_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while(q.size()>0) {
			qu.add(q.peek());
			st.push(q.remove());
		}
		while(st.size() > 0) {
			System.out.print(st.pop()+" ");
		}
		while(qu.size() > 0) {
			q.add(qu.remove());
		}
		System.out.println();
		System.out.println(q);
	}

}
