package BackTracking_1;


public class Count_Ways_nQueen {
	
	public static boolean isSafe(char board[][] , int row , int col) {
		//Vertically up
		
				for(int i = row-1 ; i >= 0 ; i--) {
					if(board[i][col] == 'Q')return false;
				}
				
				//Diagonal left
				for(int i = row-1 , j = col-1 ; i >= 0 && j >= 0 ; i--,j--) {
					if(board[i][j] == 'Q')return false;
				}
				
				//Diagonal right
				for(int i = row-1 , j = col+1 ; i >= 0 && j < board.length ; i--,j++) {
					if(board[i][j] == 'Q')return false;
				}
				return true;
	}
	
	public static void count(char [][] board , int row) {
		if(row == board.length ) {
			res++ ;
			return ;
		}
		for(int j =0 ; j < board.length ;j++) {
			if(isSafe(board ,row,j)) {
				board[row][j] = 'Q';
				count(board, row+1);
				board[row][j] ='.';
			}
		}
	}

	static int res = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char board[][] = new char[n][n];
		for(int i = 0; i < n ; i++) {
			for(int j =0 ; j < n ; j++) {
				board[i][j] = '.';
			}
		}
		 count(board,0);
		 System.out.println(res);
		

	}

}
