package Trees;

public class NodeSum {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}

	public static void print(Node root) {
		if(root == null)return;
		System.out.print(root.data+" ");
		if(root.left != null)System.out.print(root.left.data);
		if(root.right!= null) System.out.print(root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	public static int sum(Node root) {
		if(root == null)return 0;
		return root.data+sum(root.left)+sum(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		Node a = new Node(1);
		Node b = new Node(2);
		root.left = a;
		root.right = b;
		Node c = new Node(3);
		Node d = new Node(4);
		a.left = c;
		a.right = d;
		Node e = new Node(6);
		Node f = new Node(7);
		b.left = e;
		b.right = f;
//		print(root);
		int x = sum(root);
		System.out.println(x);
		

	}

}
