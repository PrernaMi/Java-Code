package BackTracking_1;

public class nQueen_Basic {
	
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
	
	public static void nqueen(char board[][] , int row) {
		//Base Case
		if(row == board.length) {
			print(board);
			return;
		}
		
		for(int j = 0; j < board.length ; j++) {
			if(isSafe(board,row,j)) {
				board[row][j] = 'Q';
				nqueen(board, row+1);
				//Backtracking Step
				board[row][j] = '.';
			}
		}
	}
	
	public static void print(char board[][]) {
		System.out.println("--------------nqueen------");
		for(int i =0 ; i < board.length ; i++) {
			for(int j = 0; j < board.length ; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For 3X3 or less then there is no any way to place the queen
		int n = 4;
		char board[][] = new char[n][n];
		
		//Initialize
		for(int i =0 ; i < n ; i++) {
			for(int j =0 ; j < n ; j++) {
				board[i][j] = '.';
			}
		}
		nqueen(board , 0);

	}

}
