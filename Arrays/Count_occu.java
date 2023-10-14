package Arrays;

class Count_occu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int arr[] = {3, 5, 0, 7, 8, 3, 0};
		int x = 0;
		int count = 0;
		for(int i =0 ; i < n ; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		System.out.print(count);
	

	}

}
