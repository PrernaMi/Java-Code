package Arrays;

public class Rearranges_array {
	public static void Rearrange(int a[], int n)
    {
        // Your code goes here
        int count =0;
        for(int i =0 ; i < n ; i++){
            if(a[i] >= 0){
                count++;
            }
        }
        int arr[] = new int[count];
        int j =0;
        for(int i =0 ; i <  n ; i++){
            if(a[i] >= 0){
                arr[j] = a[i];
                j++;
            }
        }
        int k =0;
        for(int i =0 ; i < n ; i++){
            
            if(a[i] < 0){
                a[k] = a[i];
                k++;
            }
        }
        int index = n-count;
        int l = 0;
        for(int i = index ; i < n ; i++){
            a[i] = arr[l];
            l++;
        }
    }
	public static void printarr(int arr[] , int n) {
		for(int i =0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int Arr[] = {-3, 3, -2, 2};
		Rearrange(Arr,N);
		printarr(Arr,N);

	}

}
