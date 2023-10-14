package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Remove_subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,2,10,10,10,4,4,5,8,9,10,10,5};
		Stack<Integer> st = new Stack<Integer>();
		int val = Integer.MIN_VALUE;
		for(int i =0 ; i < arr.length ; i++) {
			if(st.isEmpty()) st.push(arr[i]);
			else if(!st.isEmpty() && st.peek() != arr[i] && arr[i] != val) st.push(arr[i]);
			else if(!st.isEmpty() && st.peek() == arr[i]) val = st.pop();
			else continue;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!st.isEmpty()) {
			list.add(st.pop());
		}
		Collections.reverse(list);
		for(int i : list) System.out.print(i+" ");
	}

}
