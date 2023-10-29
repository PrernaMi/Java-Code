package BackTracking_1;

import java.util.ArrayList;

public class Find_Subsets {
	
	public static void print(String str,ArrayList<String> list,String ans,int i) {
		if(i == str.length()) {
			list.add(ans);
			return;
		}
		char ch = str.charAt(i);
		
		//Choice to be Yes
		print(str, list, ans+ch, i+1);
		
		//Choice to be No
		print(str, list, ans, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		ArrayList<String> ans = new ArrayList<String>();
		print(str,ans,"",0);
		System.out.println(ans);
	}

}
