package Arrays;

public class Celebrity_Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] ={{0 ,1, 0},
		         {0 ,0 ,0}, 
		         {0 ,1 ,0}};
		int n = M.length;
		int idx =-1;
    	for(int i = 0; i < n ; i++){
    	    boolean flag = true;
    	    for(int j =0 ; j < n ; j++){
    	        if(i != j && M[i][j] != 0) {
    	            flag = false;
    	            break;
    	        }
    	    }
    	    if(flag == true) {
    	    	idx =i;
    	    	break;
    	    }
    	    
    	}
    	for(int j = 0 ; j < n ; j++){
    	    boolean flag = true;
    	    for(int i = 0; i < n ; i++){
    	        if(i != j && M[i][j] != 1){
    	            flag = false;
    	            break;
    	        }
    	        
    	    }
    	    if(flag == true) 
    	    	{
    	    	System.out.println(idx);
    	    	return;
    	    	}
    	}
    	 System.out.println(-1);
		

	}

}
