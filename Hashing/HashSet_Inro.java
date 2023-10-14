package Hashing;

import java.util.HashSet;

public class HashSet_Inro {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(4);
		set.add(6);
		for(int i : set) {
			System.out.print(i+" ");
		}
	}
}
