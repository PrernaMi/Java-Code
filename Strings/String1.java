package Strings;

import java.util.ArrayList;

public class String1 {

	public static void main(String[] args) {
		String str1 = "baseball";
		String str2 = "a,all,b,ball,bas,base,cat,code,d,e,quit,z";
		ArrayList<String> list = new ArrayList<String>();
			for(int i =0 ; i < str1.length(); i++) {
				String a = str1.substring(0,i+1);
				String b = str1.substring(i+1);
				if(str2.contains(a) && str2.contains(b)) {
					list.add(a);
					list.add(b);
					System.out.println(list);
					return;
				}
			}
				System.out.print("Not exist");
//			System.out.println(count);
//				return;
			
	}

}
