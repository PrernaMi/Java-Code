package Sheet_ans;

import java.util.HashSet;
import java.util.TreeSet;

public class Kth_Missing_Positive_Integer {
	
    public static int findKthPositive(int[] arr, int k) {
        
    	HashSet<Integer> set1 = new HashSet<Integer>();
    	TreeSet<Integer> set2 = new TreeSet<>();
    	for(int i : arr) set1.add(i);
    	int max = Integer.MIN_VALUE;
    	for(int i = 0 ; i < arr.length ; i++) {
    		max = Math.max(max, arr[i]);
    	}
    	for(int i =1 ; i <= max ; i++) {
    		if(!set1.contains(i)) set2.add(i);
    	}
    	int c = 1;
    	for(int i : set2) {
    		if(c == k) {
    			return i;
    		}
    		c++;
    	}
    	return -1;
    	
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,7,11};
		int k = 5;
		int ans =  findKthPositive( arr,  k);
		System.out.println(ans);
	}

}
