package Trees;


public class Max_Node {
	
	public static class Node{
		 int data;
		 Node left;
		 Node right;
		 Node(int data){
			 this.data = data;
		 }
	}
	
	public static int max(Node root) {
		if(root.left == null && root.right == null)return root.data;
		int a = root.data;
		int b = Integer.MIN_VALUE;
		int c = Integer.MIN_VALUE;
		if(root.left != null) {
			 b = max(root.left);
		}
		if(root.right != null) {
			c = max(root.right);
		}
		return Math.max(a, Math.max(b, c));
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
		int n = max(root);
		System.out.println(n);

	}

}
