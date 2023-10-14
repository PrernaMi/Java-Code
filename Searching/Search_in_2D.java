package Searching;

public class Search_in_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {
				{10, 20, 30 ,40},
				{15 ,25, 35, 45},
				{27 ,29 ,37 ,48},
				{32, 33, 39, 50}
		};
		int X = 37;
		int N = 4;
		int M = 4;

		int s =0;
        int e = N*M-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(mat[mid/M][mid%M] ==X) {
            	System.out.println(1);
            	return;
            	}
            else if(mat[mid/M][mid%M] > X){
                e = mid-1;
            }else{
                s=mid+1;
            }
        }
        System.out.println(0);
	}

}
