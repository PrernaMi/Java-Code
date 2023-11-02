package Strings;

public class Anagram_string {
	public static boolean isAnagram(String str1, String str2) {
        //Your code goes here
        if(str1.length() != str2.length())return false;
        StringBuilder sb = new StringBuilder(str2);
        for(int i = 0; i < str1.length() ; i++){
            char ch = str1.charAt(i);
            if(str2.contains(ch+"")){
                int idx = sb.indexOf(ch+"");
                sb.setCharAt(idx, '0');
            }else return false;
        }
        for(int i = 0; i < sb.length() ; i++) {
        	if(sb.charAt(i) != '0')return false;
        }
        return true;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "prernam";
		String str2 = "anerprm";
		boolean res = isAnagram(str1,str2);
		System.out.println(res);

	}

}
