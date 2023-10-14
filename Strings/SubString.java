package Strings;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abcd";
		for(int i =0 ; i < st.length() ; i++) {
			for(int j = i+1; j <= st.length() ; j++) {
				System.out.print(st.substring(i, j)+" ");
			}
			System.out.println();
		}

	}

}
