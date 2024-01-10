package Heap;

import java.util.ArrayList;

public class Dlt_max_heap {
	
	public static void swap(ArrayList<Integer>heap,int i , int j) {
		int temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public static void push_down(ArrayList<Integer>heap,int i) {
		int n = heap.size()-1;
		if(i == n)return;
		int left = (2*i)+1;
		int right = (2*i)+2;
		int big = i;
		if(i <= n && heap.get(left) > heap.get(i))big=left;
		if(i <= n && heap.get(right) > heap.get(i))big=right;
		if(big == i)return;
		swap(heap, i, big);
	}

	public static void delete(ArrayList<Integer>heap) {
		int n = heap.size()-1;
		swap(heap,0,n);
		heap.remove(n);
		push_down(heap,0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>Heap = new ArrayList<Integer>();
		Heap.add(100);
		Heap.add(80);
		Heap.add(60);
		Heap.add(40);
		Heap.add(50);
		delete(Heap);
		System.out.println(Heap);
	}

}
