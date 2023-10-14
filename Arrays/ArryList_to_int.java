package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArryList_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		
		Integer arr[] = new Integer[list.size()];
		arr = list.toArray(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
