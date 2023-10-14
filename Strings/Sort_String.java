package Strings;

public class Sort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "prerna";
		StringBuilder s = new StringBuilder();
		int arr[] = new int[27];
		for(int i =0; i < st.length() ; i++) {
			int k = (int)(st.charAt(i)-'a');
			arr[k]++;
		}
		for(int i =0 ; i < arr.length ; i++) {
			while(arr[i] != 0) {
				char cha = (char)(i+'a');
				s.append(cha);
				arr[i]--;
			}
		}
		System.out.println(s);
	}
}
