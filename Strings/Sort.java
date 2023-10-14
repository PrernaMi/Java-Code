package Strings;

import java.util.Arrays;


public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prerna";
		char[] arr = s.toCharArray();
		for(int i =0 ; i < arr.length-1 ; i++) {
			int min = i;
			for(int j =i+1 ; j < arr.length ; j++) {
				char a = arr[i];
				char b = arr[j];
				if(b < a) {
					min = j;
				}
			}
			char ch = arr[i];
			arr[i] = arr[min];
			arr[min] = ch;
		}
	   for(int i =0 ; i < arr.length ; i++) {
		   System.out.print(arr[i]);
	   }
		
		
	}

}
