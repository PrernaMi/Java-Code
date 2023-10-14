package Hashing;

import java.util.HashSet;
import java.util.Iterator;
public class Iteration_Set {
	public static void main(String [] argsg) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
//			int a = (int) it.next();
			if(set.contains(4)) {
				set.remove(4);
				break;
			}
			it.next();
		}
	
		System.out.println(set);
		
	}

}
