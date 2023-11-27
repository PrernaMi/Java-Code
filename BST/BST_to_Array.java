package BST;

import java.util.ArrayList;

public class BST_to_Array {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void addall(Node root,ArrayList<Integer> list) {
		if(root == null)return;
		addall(root.left, list);
		list.add(root.data);
		addall(root.right, list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
		Node a = new Node(4);
		Node b = new Node(11);
		root.left = a;
		root.right = b;
		Node c = new Node(3);
		Node d = new Node(6);
		a.left = c;
		a.right = d;
		Node e = new Node(13);
		b.right = e;
		Node f = new Node(2);
		c.right = f;
		Node g = new Node(5);
		d.left = g;
		Node h = new Node(12);
		e.left = h;
		ArrayList<Integer> list = new ArrayList<>();
		addall(root,list);
		System.out.println(list);

	}

}
