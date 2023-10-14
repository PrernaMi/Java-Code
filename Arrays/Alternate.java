package Arrays;

import java.util.Arrays;

public class Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, -3, 4 ,-5};
		int n = a.length;
        int arr[] = new int[n];
        Arrays.sort(a);
        int count =0;
        for(int i =0 ; i < n ; i++){
            if(a[i] < 0) {count++;}
        }
        int p =0;
        int q = count;
        int k =0;
        while(q < n){
            arr[k++] = a[q++];
            if(p < count){
            arr[k++] = a[p++];
            }
        }
        for(int d : arr) {
        	System.out.print(d+" ");
        }

	}

}
