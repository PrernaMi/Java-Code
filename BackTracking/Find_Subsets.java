package BackTracking;

public class Find_Subsets {
	
	public static void find(String str , String ans , int i) {
		//Base Case
		if(i == str.length()) {
			if(ans.length() == 0) System.out.print("null"+" ");
			else System.out.print(ans+" ");
			return;
		}
		//Recursion
		//Yes Choice
		find(str, ans+str.charAt(i), i+1);
		//No choice
		find(str, ans, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String s = "abc";
		find(s , "" , 0 );
		

	}

}
