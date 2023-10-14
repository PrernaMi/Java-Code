package Recursion;

import java.util.ArrayList;

public class Find_Index {
	
	public static ArrayList<Integer> find(int arr[] , int i , int x) {
		//Base Case
		if(i == arr.length) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(arr[i] == x) {
			list.add(i);
		}
		ArrayList<Integer> ans = find(arr, i+1, x);
		list.addAll(ans);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,8,8,8,89};
		int x = 8;
		int index =0;
		ArrayList<Integer> list = find(arr,index,x);
		for(int i : list) {
			System.out.print(i+" ");
		}

	}

}
