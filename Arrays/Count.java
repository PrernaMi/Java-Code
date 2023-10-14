package Arrays;

public class Count {
	public static int count(int arr[] ,int  n, int x ) {
		int i =0;
        int j = n-1;
        while(i <= j){
            if(arr[i] == x && arr[j] == x){
                return j-i+1;
            }else if(arr[i] != x && arr[j] != x){
                i++;
                j--;
            }else if(arr[i] != x){
                i++;
            }else {
            	j--;
            }
        }
        return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		int x = 2;
		int arr[] = {1, 1,2,2,2,2, 3};
		int val = count(arr,n,x);
		System.out.println(val);

	}

}
