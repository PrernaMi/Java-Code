package Arrays;

public class Spiral_Num {
	
	public static int print(int A[][] , int n , int m , int k) {
		int tr = 0;
        int br = n-1;
        int lc =0;
        int rc = m-1;
        int count =0;
        while(count < n*m){
            for(int i = lc ; i <= rc ; i++){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[tr][i];
                }
            }
            tr++;
            for(int i = tr ; i <= br ; i++){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][rc];
                }
            }
            rc--;
            for(int i = rc ; i >= lc ; i--){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[br][i];
                }
            }
            br--;
            for(int i = br ; i >= tr ; i--){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][lc];
                }
            }
            lc++;
        }
        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{1 ,2, 3},
		         {4 ,5, 6},
		         {7 ,8, 9},
		         {2,3,4}};
		int n =4;
		int m =3;
		int k =12;
		int value = print(A,n,m,k);
		System.out.println(value);

	}

}
