package Trees_1;


public class Boundary_Traversal {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void left_traversal(Node root) {
		if(root.left == null && root.right == null)return;
		if(root.left != null) {
			System.out.print(root.data+" ");
			left_traversal(root.left);
		}else {
			System.out.print(root.data+" ");
			left_traversal(root.right);
		}
	}

	public static void leaf_traversal(Node root) {
		if(root.left == null && root.right == null) {
			System.out.print(root.data+" ");
			return;
		}
		leaf_traversal(root.left);
		leaf_traversal(root.right);
	}
	
	public static void right_traversal(Node root) {
		if(root.left == null && root.right == null)return;
		if(root.right != null)right_traversal(root.right);
		else right_traversal(root.left);
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
		a.right = d;
		Node e = new Node(6);
		b.left = e;
		Node f = new Node(7);
		b.right = f;
		left_traversal(root);
		leaf_traversal(root);
		right_traversal(root.right);

	}

}
