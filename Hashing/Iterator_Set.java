package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,1,5,3,3};
		HashSet<Integer> set = new HashSet<>();
		for(int i : arr) {
			set.add(i);
		}
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			if(set.contains(3)) {
//				set.remove(3);
//				break;
//			}
//			it.next();
//		}
//		if(set.contains(3)) {
//			set.remove(3);
//		}
		System.out.println(set);

	}

}
