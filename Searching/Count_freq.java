package Searching;

public class Count_freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int x = 2;
		int n = arr.length;
		int ans = 0;
        int i =0 ;
        int j = n-1;
        while(i <= j){
            int mid = i+(j-i)/2;
            if(arr[mid] == x){
                ans = mid;
                j = mid-1;
            }else if(arr[mid] > x){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        int a =0;
        int b = n-1;
        int an = 0;
        while(a <= b){
            int mid = a+(b-a)/2;
            if(arr[mid] == x){
                an = mid;
                a = mid+1;
            }else if(arr[mid] > x){
                b = mid-1;
            }else{
                a = mid+1;
            }
        }
        System.out.println(an-ans+1);

	}

}
