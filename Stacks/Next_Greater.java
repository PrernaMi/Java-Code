package Stacks;
import java.util.*;

public class Next_Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,2,1,8,6,3,4};
		int n = a.length;
		int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        int max = a[n-1];
        arr[n-1] = -1;
        st.push(a[n-1]);
        for(int i = n-2 ; i >= 0 ; i--){
            max = Math.max(max , a[i]);
            if(st.peek() > a[i]){
                arr[i] = st.pop();
                st.push(a[i]);
                continue;
            }
            while(!st.isEmpty() && st.peek() < a[i]){
                st.pop();
            }
            if(st.isEmpty() && a[i] >= max){
                arr[i] =-1;
            }else if(st.isEmpty() && a[i] < max){
                arr[i] = max;
            }
            st.push(a[i]);
        }
        for(int i :arr) {
        	System.out.print(i+" ");
        }

	}

}
