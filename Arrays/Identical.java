package Arrays;
import java.util.*;
public class Identical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = 2;
        int m  = 3;
        int arr[][] = {{1, 2, 3},
        {4 ,6 ,8}};
       
        int a =2;
        int b  = 3;
        int arr1[][] = {{1, 2, 3},
                {4 ,6 ,8}};
        
        if(n == a && m == b){
            for(int i =0 ; i < n ; i++){
                for(int j =0 ; j < m ; j++){
                    if(arr[i][j] != arr1[i][j]){
                        System.out.print("NO");
                        return;
                    }
                }
            }
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

	}

}
