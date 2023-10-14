package Arrays;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = 3;
        int m  = 2;
        int arr[][] = {
        		{1,2},
        		{2,2},{2,3}
        };
       
        int a = 3;
        int b  = 1;
        int arr1[][] = {{1},{2},{4}};
        
        if(n != a ){
            System.out.print("GIVEN MATRICES CANNOT BE ADDED");
            return;
        }if(m != b) {
        	System.out.print("GIVEN MATRICES CANNOT BE ADDED");
            return;
        }
        for(int i = 0 ; i < n ; i++){
           
            for(int j  =0 ; j < m ; j++){
                 
                arr[i][j] += arr1[i][j];
            }
        }
        for(int i =0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

	}

}
