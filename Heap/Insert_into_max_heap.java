package Heap;

import java.util.*;

public class Insert_into_max_heap {
	
	public static void swap(ArrayList<Integer>heap,int i,int j) {
		int temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	
	public static void check(ArrayList<Integer>heap,int i) {
		int parent_idx = (i-1)/2;
		if(i == 0 || heap.get(parent_idx)>heap.get(i))return;
		swap(heap,i,parent_idx);
		check(heap, parent_idx);
	}

	public static void insert(ArrayList<Integer>heap,int val) {
		heap.add(val);
		check(heap,heap.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Heap = new ArrayList<Integer>();
		Heap.add(100);
		Heap.add(80);
		Heap.add(60);
		Heap.add(40);
		Heap.add(50);
		insert(Heap,107);
		System.out.println(Heap);
	}

}
