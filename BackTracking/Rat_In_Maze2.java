package BackTracking;

public class Rat_In_Maze2 {
	
	public static int maze(int er , int ec) {
		if(er == 1 || ec == 1)return 1;
		return maze( er-1, ec)+maze( er, ec-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = maze(3,3);
		System.out.println(ans);

	}

}
