package Stacks;

import java.util.Stack;

public class Print_In_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(3);
		st.push(4);
		st.push(6);
		st.push(7);
		st.push(8);
//		System.out.println(st);
		int n = st.size();
		int arr[] = new int[n];
		for(int i = n-1 ; i >= 0 ; i--) {
			arr[i] = st.pop();
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arr) {
			st.push(i);
		}
		System.out.println(st);

	}

}
