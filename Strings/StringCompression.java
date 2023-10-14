package Strings;


public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbbccddd";
		int count =1;
		char c = s.charAt(0);
		StringBuilder sb = new StringBuilder();
		sb.append(c);
		for(int i =1 ; i < s.length() ; i++) {
			char ch = s.charAt(i); //d
			char ch1 = s.charAt(i-1); //c
			if(ch == ch1) count++;
			else {
				if(count > 1) {
					sb.append(count);
				}
				sb.append(ch);
				count =1;
			}
			
		}
		if(count > 1) {
			sb.append(count);
		}
		System.out.println(sb);
	}

}
