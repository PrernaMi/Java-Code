package Strings;

public class Check_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hello World";
		String bString = s.trim();
		System.out.println(bString);
		String arr[] = s.trim().split(" ");
		int n = arr.length;
		if(n == 1) {
			String st = arr[n-1];
			System.out.println(st.length());
			return;
		}
		else {
			if(arr[n-1] == " ") {
				String st = arr[n-2];
				System.out.println(st.length());
			}
		}

	}

}
