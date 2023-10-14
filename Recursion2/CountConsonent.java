package Recursion2;

public class CountConsonent {
	
	public static int fun(String st , int i) {
		if(i == st.length()) return 0;
		char ch = st.charAt(i);
		 int val = fun(st, i+1);
		 if(ch != 'a' && ch != 'e' && ch!='i' && ch!='o' && ch!='u') {
			 return val+1;
		 }else return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefioty";
		int val = fun(s,0);
		System.out.println(val);

	}

}
