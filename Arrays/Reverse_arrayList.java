package Arrays;

import java.util.ArrayList;

public class Reverse_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		int i =0;
		int j = list.size()-1;
		while(i < j) {
			Integer temp = list.get(Integer.valueOf(i));
			list.set(i,list.get(Integer.valueOf(j)) );
			list.set(j, temp);
			i++;
			j--;
		}
//		for(Integer in : list) {
//			System.out.print(in+" ");
//		}
		System.out.println(list);
	}

}
