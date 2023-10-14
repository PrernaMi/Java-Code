package Arrays;

public class Small_comman {
	
	public static int getCommon(int[] nums1, int[] nums2) {
        int i =0;
        int j = 0;
        int count = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
               return nums1[i];
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
       return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,1,2};
		int arr2[] = {2,3};
		int val = getCommon(arr1,arr2);
		System.out.println(val);

	}

}
