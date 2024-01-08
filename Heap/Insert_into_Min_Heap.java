package Heap;

import java.util.ArrayList;

public class Insert_into_Min_Heap {
	
	public static void swap(ArrayList<Integer> heap,int i,int j) {
		int temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}
	public static void correct(ArrayList<Integer>heap,int i) {
		int parent_idx = (i-1)/2;
		if(i == 0 || heap.get(parent_idx) < heap.get(i))return;
		swap(heap,parent_idx,i);
		correct(heap, parent_idx);
	}
	public static void insert(ArrayList<Integer>heap,int val) {
		heap.add(val);
		correct(heap,heap.size()-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Heap = new ArrayList<Integer>();
		Heap.add(10);
		Heap.add(20);
		Heap.add(30);
		Heap.add(40);
		Heap.add(50);
		insert(Heap,100);
		System.out.println(Heap);

	}

}
