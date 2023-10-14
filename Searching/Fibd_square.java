package Searching;

public class Fibd_square {
	public static boolean bs(int s , int e , int n){
        while(s <= e){
            int mid = s+(e-s)/2;
        int val = (int)mid*mid;
        if(val == n){
            return true;
        }else if(val > n){
            e = mid-1;
        }else{
            s = mid+1;
        }
        }
        return false;
    }
    public static boolean judgeSquareSum(int c) {
       boolean rem = false;
        for(int i = 0; i*i <= c ; i++){
             int val = c-(i*i);
             rem = bs(0,val,val);
             if(rem == true) {
            	 return true;
             }
        }
        return rem;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000000000;
		boolean val = judgeSquareSum(n);
		System.out.println(val);

	}

}
