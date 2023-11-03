package Strings;

public class Reverse_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Prerna Mittal";
		String arr[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1 ; i > 0 ; i--) {
			sb.append(arr[i]+" ");
		}
		sb.append(arr[0]);
		System.out.println(sb);
	}

}
