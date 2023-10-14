package BackTracking;

public class Rat_In_maze {
	
	public static int maze(int sr, int sc , int er , int ec) {
		if(sr > er || sc > ec) return 0;
		if(sr == er && sc == ec)return 1;
		int dwm = maze(sr+1, sc, er, ec);
		int rig = maze(sr, sc+1, er, ec);
		return dwm+rig;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = maze(1,1,3,3);
		System.out.println(count);

	}

}
