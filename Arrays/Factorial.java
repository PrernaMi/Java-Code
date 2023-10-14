package Arrays;

public class Factorial {
	
	public static int fact(int N) {
		for(int i = 2 ; i < N ; i++){
            if(N % i == 0){
                return 1;
            }
        }
        return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 441;
		int a = fact(n);
		System.out.println(a);

	}

}
