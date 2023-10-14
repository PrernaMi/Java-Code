package Arrays;
import java.util.*;
public class Remove_Value {
	public static void main(String [] args) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i < nums.length ; i++){
            list.add(nums[i]) ;
        }
        for(int i =0 ; i < nums.length ; i++){
            if(list.contains(Integer.valueOf(val))){
                list.remove(Integer.valueOf(val));
            }
        }
        System.out.println(list.size());
		
	}

}
