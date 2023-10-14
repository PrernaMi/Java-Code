package Strings;

public class Palindrome {
	
	public static int isPalindrome(String S) {
        // code here
      StringBuilder sb = new StringBuilder(S);
      sb.reverse();
      String s = sb +"";
      if(S.equals(s)) {
    	  return 1;
      }else return 0;
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hq";
		int val = isPalindrome(s);
		System.out.println(val);

	}

}
