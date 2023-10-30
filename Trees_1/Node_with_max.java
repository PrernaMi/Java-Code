package Trees_1;


public class Node_with_max {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int max(Node root) {
		if(root == null)return Integer.MIN_VALUE;
		if(root.left == null && root.right == null)return root.data;
		return Math.max(root.data, Math.max(max(root.left), max(root.right)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		root.left = a;
		root.right = b;
		Node c = new Node(4);
		Node d = new Node(51);
		a.left = c;
		a.right =d;
		Node e = new Node(6);
		Node f = new Node(7);
		b.left = e;
		b.right =f;
		int res = max(root);
		System.out.println(res);


	}

}
