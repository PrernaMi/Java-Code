package PriorityQueue;
import java.util.*;
public class k_Cloest_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int points[][] = {{-5,4},{-6,-5},{4,6}};
		int k = 2;
		HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[points.length];
        int n = points.length;
        for(int i = 0; i < n ; i++){
            int val = (points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
//            int fin = (int)Math.sqrt(val);
            arr[i] = val;
            map.put(i,val);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr)pq.add(i);
        int ans[][] = new int[k][2];
        int i =1 ;
        int p =0;
        while(i <= k){
            int val = pq.remove();
            for(int z : map.keySet()){
                if(map.get(z) == val){
                    ans[p][0] = points[z][0];
                    ans[p][1] = points[z][1];
                    p++;
                    map.put(z, -1);
                    break;
                }
            }
            i++;
        }
        for(int a = 0 ; a < k ; a++) {
        	for(int b = 0 ; b < 2 ; b++) {
        		System.out.print(ans[a][b]+" ");
        	}
        	System.out.println();
        }
	}

}
