package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter query");
		int q = s.nextInt();
		int arr[] = {1, 4, 1};
		for(int i = 1 ; i < arr.length ; i++) {
			arr[i] += arr[i-1];
		}
		while(q --> 0) {
			System.out.println("Enter the value of i ");
			int i = s.nextInt();
			System.out.println("Enter the value of j ");
			int j = s.nextInt();
//			int sum =0 ;
//			for(int k = i ; k <= j ; k++) {
//				sum += arr[k];
//			}
//			list.add(sum);
			if(i != 0) list.add(arr[j]-arr[i-1]);
			else list.add(arr[j]);
					
		}
		System.out.println(list);

	}

}
