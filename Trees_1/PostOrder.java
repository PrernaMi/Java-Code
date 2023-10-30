package Trees_1;

import Trees_1.InOrder_traversal.Node;

public class PostOrder {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void postoredr(Node root) {
		if(root == null)return ;
		postoredr(root.left);
		postoredr(root.right);
		System.out.print(root.data+" ");
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
		a.right =d;
		Node e = new Node(6);
		Node f = new Node(7);
		b.left = e;
		b.right =f;
		postoredr(root);

	}

}
