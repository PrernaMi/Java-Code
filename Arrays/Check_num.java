package Arrays;

public class Check_num {
	
	public static boolean checkIfExist(int[] arr) {
		int i =0;
        int j = i+1;
        while(i < arr.length-1){
            if(j == arr.length && i < arr.length-2) {
            	j=0;
            	i++;
            	j=i+1;
            }
            if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]){
                return true;
            }
            j++;
        }
        return false;
	}
	
	public static boolean checkIfExist1(int arr[]) {
		 for(int i =0 ; i < arr.length-1 ; i++){
	            for(int j = i+1 ; j < arr.length ; j++){
	                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,0,10,-19,4,6,-8};
		boolean val = checkIfExist(arr);
//		boolean val = checkIfExist1(arr);
		System.out.println(val);

	}

}
