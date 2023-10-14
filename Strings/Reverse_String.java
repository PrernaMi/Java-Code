package Strings;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a educator";
		StringBuilder sb = new StringBuilder();
		int index =0;
		int k =0;
		for(int i =0 ; i < s.length() ; i++) {
			if(s.charAt(i) == ' ' || i== s.length()-1) {
				if(i== s.length()-1) {
					k = i+1;
				}else{
					k =i;
				}
				StringBuilder sbr = new StringBuilder(s.substring(index, k));
				sbr.reverse();
				sb.append(sbr);
				sb.append(" ");
				index = i+1;
			}
		}
		System.out.println(sb);

	}

}
