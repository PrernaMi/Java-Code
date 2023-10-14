package Recursion;

public class LowerCase {
	
	public static int fun(String st , int i) {
		if(i == st.length()) return 0;
		char ch = st.charAt(i);
		int val = fun(st, i+1);
		if(ch >= 'a' && ch <= 'z') return val+1;
		else return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "CollegeWallah";
		int res = fun(s,0);
		System.out.println(res);

	}

}
