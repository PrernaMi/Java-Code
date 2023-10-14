package Trees;


public class Size_of_tree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int size(Node root) {
		if(root == null)return 0;
		int a = 0;
		int b = 0;
		if(root.left != null) {
			a=size(root.left);
		}
		if(root.right != null) {
		b =	size(root.right);
		}
		return 1+a+b;
	}
	
	public static int sum(Node root) {
		if(root.left == null && root.right == null) return root.data;
		int a =0;
		int b =0;
		if(root.left != null) {
			 a= sum(root.left);
		}
		if(root.right != null) {
			b = sum(root.right);
		}
		return root.data + a+b;
	}
	
	
	public static int max(Node root) {
		if(root.left == null && root.right == null)return root.data;
		int a = root.data;
		int b =Integer.MIN_VALUE;
		int c =Integer.MIN_VALUE;
		if(root.left != null) {
			b = max(root.left);
		}
		if(root.right != null) {
			c = max(root.right);
		}
		return Math.max(a, Math.max(b, c));
	}
	
	public static int min(Node root) {
		if(root.left == null && root.right == null)return root.data;
		int a = root.data ;
		int b = Integer.MAX_VALUE;
		int c = Integer.MAX_VALUE;
		if(root.left != null) {
			b = min(root.left);
		}
		if(root.right != null) {
			c= min(root.right);
		}
		return Math.min(a, Math.min(b, c));
	}
	
	public static int heightNode(Node root) {
		if(root == null)return 0;
		return 1+Math.max(heightNode(root.left), heightNode(root.right));
	}

	public static int heightEdge(Node root) {
		if(root.left == null && root.right == null)return 0;
		int a = 0;
		int b =0;
		if(root.left != null) {
			a = heightEdge(root.left);
		}
		if(root.right != null) {
			b = heightEdge(root.right);
		}
		return 1+Math.max(a, b);
	}
	
	public static void preOrder(Node root) {
		if(root == null)return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if(root == null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root == null)return;
		postOrder(root.left);
		postOrder(root.right);
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
		System.out.print("Size is "+size(root));
		System.out.println();
		System.out.print("sum will be "+sum(root));
		System.out.println();
		System.out.print("Max will be "+max(root));
		System.out.println();
		System.out.print("Min will be "+min(root));
		System.out.println();
		System.out.print("Node height will be "+heightNode(root));
		System.out.println();
		System.out.print("Egde height will be "+heightEdge(root));
		System.out.println();
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
	}

}
