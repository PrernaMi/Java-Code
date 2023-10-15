package BackTracking;

public class Four_Drn_mazePath {
	
	public static int path(int sr , int sc , int er , int ec,boolean arr[][]) {
		if( sc > ec || sr > er ||sc < 0 ||  sr < 0 ) {
			return 0;
		}
		if(arr[sr][sc] == true)return 0;
		if(sr == er && sc == ec) {
			return 1;
		}
		arr[sr][sc] = true;
		int a=  path(sr+1, sc, er, ec,arr);
	    int b =	path(sr, sc+1, er, ec,arr);
		int c=	path(sr-1, sc, er, ec,arr);
		int d =	path(sr, sc-1, er, ec,arr);
		arr[sr][sc] = false;
		return a+b+c+d;
		
	}
	
	public static void print(int sr , int sc , int er,int ec,boolean arr[][] , String s) {
		if( sc > ec || sr > er ||sc < 0 ||  sr < 0 ) {
			return ;
		}
		if(arr[sr][sc] == true)return ;
		if(sr == er && sc == ec) {
			System.out.println(s);
			return;
		}
		arr[sr][sc] = true;
		print(sr+1, sc, er, ec, arr, s+"R");
		print(sr, sc+1, er, ec, arr, s+"D");
		print(sr-1, sc, er, ec, arr, s+"U");
		print(sr, sc-1, er, ec, arr, s+"L");
		arr[sr][sc] = false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 3;
		int col = 3;
		boolean arr[][] = new boolean[row][col];
//		int res = path(0,0,row-1,col-1,arr);
//		System.out.println(res);
		print(0,0,row-1,col-1,arr,"");

	}

}
