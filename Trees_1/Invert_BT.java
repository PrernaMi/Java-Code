package Trees_1;

import Trees.Sum_of_Node.Node;

public class Invert_BT {
	
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
	
	public static void invert(Node root) {
		if(root == null || root.left == null && root.right == null)return;
		invert(root.left);
		invert(root.right);
		Node templ = root.left;
		Node tempr = root.right;
		root.left = tempr;
		root.right = templ;
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
		Node f = new Node(7);
		b.left = e;
		b.right = f;
		invert(root);
		display(root);
	}

}
