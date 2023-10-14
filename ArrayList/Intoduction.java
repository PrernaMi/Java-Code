package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Intoduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(4);
//		list.add(5);
//		list.add(76);
//		list.add(7);
//		list.add(49);
//		list.add(22);
//		System.out.println(list);
//	    Integer arr[] = new Integer[list.size()];
//	    arr=list.toArray(arr);
//	    for(int i =0 ; i < arr.length ; i++) {
//	    	System.out.print(arr[i]);
//	    }
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer arr[] = {1,2,3,5,6,7};
		Collections.addAll(list, arr);
		System.out.println(list);
	     
	     
	}

}
