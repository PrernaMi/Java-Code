package Strings;

public class CheckString {
	
	public static boolean check(String s1 , String s2) {
		for(int i =0 ; i < s2.length() ; i++) {
			String str = s2.substring(i);
			if(str.compareToIgnoreCase(s1) == 0) {
				return true;
			}
		}
		 return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "PaWAn";
		String str2 = "PrerPaWan";
		boolean res = check(str1,str2);
		System.out.println(res);

	}

}
