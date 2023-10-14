package Strings;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prerena";
		String a = s.toUpperCase();
		char arr[] = a.toCharArray();
		Arrays.sort(arr);
		for(int i =0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}

	}

}
