package Arrays;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,2,3,4,5},
				{6,7,8,9,2},
				{11,12,13,14,56}
				};
		int R = arr.length;
		int C = arr[0].length;
		int tr =0;
		int br = R-1;
		int lc = 0;
		int rc = C-1;
		int count =0;
		while(count < R *C) {
			for(int i = lc ; i <= rc ; i++) {
				if(tr > br) {
					break;
				}
				System.out.print(arr[tr][i]+" ");
				count++;
				
			}
			tr++;
			for(int i = tr ; i <= br ; i++) {
				if(lc > rc) {
					break;
				}
				System.out.print(arr[i][rc]+" ");
				count++;
				
			}
			rc--;
			for(int i = rc ; i >= lc ; i--) {
				if(tr > br) {
					break;
				}
				System.out.print(arr[br][i]+" ");
				
				count++;
			}
		br--;
			for(int i = br ; i >= tr ; i--) {
				if(lc > rc) {
					break;
				}
				System.out.print(arr[i][lc]+" ");
				count++;
				
			}
			lc++;
		}
		

	}

}
