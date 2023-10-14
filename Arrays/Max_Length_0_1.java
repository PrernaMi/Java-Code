package Arrays;

public class Max_Length_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,1,0,0};
		int N = arr.length;
		for(int i =0 ; i < N ; i++){
            if(arr[i] == 0) arr[i] =-1;
        }
        int i = 0;
        int j = i+1 ;
        int count =0;
        int max = Integer.MIN_VALUE;
        while(j < N && i < N){
            if(arr[i]+arr[j] == 0) {
                count++;
                max = Math.max(max,count);
                i = j+1;
                j = i+1;
            }else{
                i++;
                j++;
            }
        }
        System.out.println(max*2);

	}

}
