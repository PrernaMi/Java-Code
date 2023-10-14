package Sorting;

public class Merge_2_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		int arr[] = new int[nums1.length];
        int i =0;
        int j =0;
        int k =0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < m){
            arr[k++] = nums1[i++];
        }
        while(j < n){
            arr[k++] = nums2[j++];
        }
//        int o =0;
//        for(int p : arr){
//            nums1[o++] = p;
//        }
//		
        for(int p : arr) {
        	System.out.print(p+" ");
        }

	}

}
