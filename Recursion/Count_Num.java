package Recursion;

public class Count_Num {
	
	public static double fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 27;
		double num = fact(N);
        int count =0 ;
        while(num != 0){
            double temp = num % 10;
            count++;
            num /= 10;
        }
        System.out.println(count);

	}

}
