package Hashing;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(45);
		set.add(6);
		set.add(74);
		set.add(25);
		System.out.print(set);
		if(set.contains(74)) {
			System.out.println("Hello");
		}
	}

}
