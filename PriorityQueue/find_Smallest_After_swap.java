package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class find_Smallest_After_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,1,5};
		int n = arr.length;
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i : arr)pq.add(i);
		int i = 1;
		while(i <= k) {
			int a = pq.remove();
			int b = pq.remove();
			pq.add(a*b);
			i++;
		}
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int j : pq)pq1.add(j);
		System.out.println(pq1.peek());

	}

}
