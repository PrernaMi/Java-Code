package Arrays;

public class Lexicographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s = {"papa","kiwi","water","mango","lime","Apple"};
		int n = s.length;
		for(int i =0 ; i < n-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < n ; j++) {
				char a = s[j].charAt(0);
				char b = s[min].charAt(0);
				if(a < b) {
					min = j;
				}
			}
			String temp = s[i];
			s[i] = s[min];
			s[min] = temp;
			
		}
		for(String a : s) {
			System.out.print(a+" ");
		}
	}

}
