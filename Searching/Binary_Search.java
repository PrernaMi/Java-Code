package Searching;

public class Binary_Search {
	public static int BinSearch(int arr[] , int tar , int s , int e){
        if(s > e) return -1;
        int mid = (s+e)/2;
        if(arr[mid] == tar) return mid;
        else if(arr[mid] > tar) return BinSearch(arr,tar,s,mid-1);
        else return BinSearch(arr,tar,mid+1,e);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,0,3,5,9,12};
		int target = 3;
		int index = BinSearch(arr,target,0,arr.length-1);
        System.out.println(index);

	}

}
