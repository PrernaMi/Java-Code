package Hashing;

import java.util.HashSet;

public class Intro_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2,3,6,1,4,2,2,9};
		HashSet<Integer> set = new HashSet<Integer>();
//		for(int i : arr) {
//			set.add(i);
//		}
		set.add(1);
		set.add(2);
		set.add(4);
//		System.out.println(set);
		
		if(set.contains(4)) {
			System.out.println("Yes");
		}if(!set.contains(6)) {
			System.out.println("Yes");
		}
	}

}
