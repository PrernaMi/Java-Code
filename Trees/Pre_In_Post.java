package Trees;


public class Pre_In_Post {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}

	public static void preorder(Node root) {
		if(root == null) return;
		System.out.print(root.data);
		preorder(root.left);
		preorder(root.right);
		return;
	}
	
	public static void inorder(Node root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
		return;
	}
	
	public static void postorder(Node root) {
		if(root == null)return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		Node a = new Node(3);
		Node b = new Node(5);
		root.left = a;
		root.right = b;
		Node c = new Node(8);
		Node d = new Node(2);
		a.left = c;
		a.right = d;
		Node e = new Node(61);
		b.right = e;
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);

	}

}
