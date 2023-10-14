package Sorting;

public class ArrangePositiveAndNeg {
	
	public static void arrange(int arr[]) {
		if(arr.length == 1) return;
		int count =0;
		for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] < 0) {
				count++;
			}
		}
			int pivot =0;
			int i =0;
			int j = arr.length-1;
			while(i < count && j > count) {
				while(arr[i] < pivot) {
					i++;
				}
				while(arr[j] > pivot) j--;
				if(i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
				j--;
			}
			
			for(int k: arr) {
				System.out.print(k+" ");
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {19,-20,-7,4,-13,11,-5,3};
		arrange(arr);

	}

}
