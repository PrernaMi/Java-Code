package Arrays;
import java.util.*;
public class SubarrayWithK {
	
	public static int longestSubarrayWithSumK(int a[] , int k) {
		int n = a.length;
        for(int i =1 ; i < n ; i++){
            a[i] += a[i-1];
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0 ; i < n ; i++){
            int val = a[i]-k;
            if(map.containsKey(val)){
                int index = (i-(map.get(val)+1))+1;
                max = Math.max(max, index);
            }
            if(map.containsKey(a[i])){
                min = i;
               min= Math.min(min,map.get(a[i]));
                map.put(a[i] , min);
            }else{
                map.put(a[i] , i);
            }
        }
            
        return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-13, 0, 6 ,15 ,16,
				2, 15 ,-12, 17,-16, 0,
				-3 ,19 ,-3 ,2, -9 ,-6};
		int k = 15;
		int val =longestSubarrayWithSumK(nums,k);
		System.out.println(val);
		
		

	}

}
