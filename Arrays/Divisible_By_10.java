package Arrays;

public class Divisible_By_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin = "1010";
		int even = 0;
	      int odd = 0;
	      for(int i =0 ; i < bin.length() ; i++){
	          int bit = bin.charAt(i)-'0';
	          if(i % 2 == 0){
	              even += bit;
	          }else{
	              odd += bit;
	          }
	      }
	      int delta = even - odd;
	      if(delta % 10 == 0){
	          System.out.println(1);
	          return;
	      }
	      System.out.println(0);

	}

}
