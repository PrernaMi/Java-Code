package Trees_1;

import java.util.LinkedList;
import java.util.Queue;

public class Construct_Tree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void display(Node root) {
		if(root == null)return;
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}
	
	public static void construct(String arr[]) {
		int x = Integer.parseInt(arr[0]);
		Node root = new Node(x);
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int i = 1;
		while(i < arr.length-1) {
			Node temp = queue.peek();
			if(arr[i] != "") {
				int l = Integer.parseInt(arr[i]);
				Node le = new Node(l);
				temp.left = le;
				queue.add(le);
			}
			if(arr[i+1] != "") {
				int r = Integer.parseInt(arr[i+1]);
				Node ri = new Node(r);
				temp.right = ri;
				queue.add(ri);
			}
			queue.remove();
			i += 2;
		}
		display(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"1","2","3","4","5","","6","","7"
				         ,"","","8","","","","9",""};
		construct(arr);

	}

}
