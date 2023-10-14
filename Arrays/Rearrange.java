package Arrays;

public class Rearrange {
	
	public static void Rearrang(int a[] , int n) {
		int count =0;
        for(int i =0 ; i < n ; i++){
            if(a[i] < 0) {
                count++;
            }
        }
        int k =0;
        int arr1[] = new int[count];
        int arr2[] = new int[n-count];
        for(int i =0 ; i < n ; i++){
            if(a[i] < 0){
                arr1[k] = a[i];
                k++;
            }
        }
        int p =0;
        for(int i =0 ; i < n ; i++) {
        	if(a[i] > 0) {
        		arr2[p] = a[i];
        		p++;
        	}
        }
        for(int i =0 ; i < count ; i++){
            a[i] = arr1[i];
        }
        int y =0;
        for(int l = count ; l < n ; l++) {
        	a[l] = arr2[y];
        	y++;
        }
        
        for(int o : a) {
        	System.out.print(o+" ");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,-1,4,-4};
		int n = arr.length;
		Rearrang(arr,n);

	}

}
