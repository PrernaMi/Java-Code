package Strings;

public class No_Of_palindrome {
	
	public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb+"";
        if(str.equals(s)) return true;
        else return false;
    }
	public static int CountPS(String S, int N)
    {
        //code here
        int count = 0;
        for(int i =0 ; i < N ; i++){
            for(int j = i+1 ; j <= N ; j++){
                if(check(S.substring(i,j)) == true) {
                	System.out.print(S.substring(i,j)+" ");
                	count++;
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbd";
		int N = s.length();
		int val = CountPS(s,N);
		System.out.println(val);
	}

}
