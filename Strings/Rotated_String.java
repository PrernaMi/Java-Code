package Strings;

public class Rotated_String {
	public static boolean rotateString(String s, String goal) {
        if(s.length() == goal.length() && (s+s).contains(goal))return true;
        else return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String goal = "cdeab";
		boolean res = rotateString(s,goal);
		System.out.println(res);
	}
}
