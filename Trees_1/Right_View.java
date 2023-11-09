package Trees_1;
import java.util.*;

public class Right_View {

	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void rightview(Node root ,int []arr,int idx){
        if(root == null)return;
        arr[idx] = root.data;
        rightview(root.left,arr,idx+1);
        rightview(root.right,arr,idx+1);
    }


    public static int count(Node root){
        if(root == null)return 0;
        return 1+Math.max(count(root.left),count(root.right));
    }
    
    public static void leftview(Node root,int[]arr,int idx) {
    	if(root == null)return;
    	if(arr[idx] == 0)arr[idx] = root.data;
    	leftview(root.left, arr, idx+1);
    	leftview(root.right, arr, idx+1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		root.left = a;
		root.right = b;
		Node c = new Node(4);
		Node d = new Node(5);
		a.left = c;
		a.right = d;
		Node e = new Node(6);
		b.left = e;
		Node f = new Node(7);
		b.right = f;
		Node g = new Node(8);
		d.left = g;
		int level = count(root);
		ArrayList<Integer> list1 = new ArrayList<>(level);
		ArrayList<Integer> list2 = new ArrayList<>(level);
		int arr[] = new int[level+1];
		int arr1[] = new int[level+1];
		rightview(root, arr, 1);
		leftview(root,arr1,1);
		for(int i : arr) {
			if(i != 0)list1.add(i);
		}
		for(int i : arr1) {
			if(i != 0)list2.add(i);
		}
		System.out.println(list1);
		System.out.println(list2);

	}

}
