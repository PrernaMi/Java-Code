package BackTracking;

public class Permutation {
	
	public static void find(String str , String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i =0 ; i < str.length() ; i++) {
			char curr = str.charAt(i);
			String s = str.substring(0,i)+str.substring(i+1);
			find(s, ans+curr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abc";
		find(st,"");

	}

}
