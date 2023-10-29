package BackTracking_1;

public class Permutation {
	
	public static void find_Permu(String str , String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		
		for(int i =0 ; i < str.length(); i++) {
			char curr = str.charAt(i);
			String newStr = str.substring(0,i)+str.substring(i+1);
			find_Permu(newStr, ans+curr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		find_Permu(str,"");

	}

}
