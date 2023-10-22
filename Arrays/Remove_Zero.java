package Arrays;
import java.util.*;

public class Remove_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,0,0,0};
		int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int i =0;
        while(st.size() != n){
            if(arr[i] != 0) st.push(arr[i]);
            else{
                st.push(0);
                if(st.size() != n)st.push(0);
            }
            i++;
        }
        for(int k = n-1; k >= 0 ; k--){
            arr[k] = st.pop();
        }

        for(int o : arr)System.out.print(o+" ");
	}

}
