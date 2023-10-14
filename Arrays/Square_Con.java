package Arrays;
import java.util.*;
public class Square_Con {
	public static boolean judgeSquareSum(int c) {
        HashSet<Long> set = new HashSet<>();
        for(long i = 1; i*i <= c ; i++){
            set.add(i);
        }
        for(long i = 1 ; i*i <= c ; i++){
            long val =c-(i*i);
            long a = (long) Math.sqrt(val);
            if(set.contains(a)){
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 3;
		boolean res = judgeSquareSum(c);
		System.out.println(res);

	}

}
