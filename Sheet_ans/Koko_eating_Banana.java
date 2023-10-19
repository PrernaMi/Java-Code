package Sheet_ans;

public class Koko_eating_Banana {


	public static boolean findans(int arr[] , int mid , int h) {
		int ans = 0;
		int n =arr.length;
		for(int i =0 ; i < n ; i++) {
			ans += arr[i]/mid;
			if(arr[i]%mid != 0) ans+=1;
		}
		if(ans <= h)return true;
		else return false;
	}
	
	public static int minEatingSpeed(int[] piles, int h) {
    	int s =1;
    	int e = Integer.MIN_VALUE;
    	//Finding Maximum value in array
    	for(int i =0 ; i < piles.length ; i++) {
    		if(piles[i] > e) {
    			e = piles[i];
    		}
    	}
    	//Finding answer
    	int ans = -1;
    	while(s <= e) {
    		int mid = s+(e-s)/2;
    		if(findans(piles,mid,h)) {
    			ans = mid;
    			e= mid-1;
    		}else s = mid+1;
    	}
    	return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,6,7,11};
		int h = 8;
		int ans = minEatingSpeed( arr, h) ;
		System.out.println(ans);

	}

}
