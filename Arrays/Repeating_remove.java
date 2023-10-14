package Arrays;
import java.util.*;
public class Repeating_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,2};
		int n = a.length;
		int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < a.length ; i++){
            map.put(a[i] , map.getOrDefault(a[i], 0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) > 1) {
                arr[0] = i;
                break;
            }
        }
        int val = (n*(n+1))/2;
        int sum =0;
        for(int i = 0 ; i < n ; i++){
            if(a[i] != arr[0])  sum += a[i];
        }
        sum += arr[0];
        arr[1] = val-sum;
        System.out.print(arr[0]+" "+arr[1]);
	}

}
