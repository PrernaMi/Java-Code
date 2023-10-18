package Trees;


public class Node_With_Max_Value {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int max(Node root) {
		if(root.left == null && root.right == null) return root.data;
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		if(root.left != null) {
			a = max(root.left);
		}
		if(root.right != null) {
			b = max(root.right);
		}
		return Math.max(root.data, Math.max(a, b));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		root.left = a;
		root.right = b;
		Node c = new Node(35);
		Node d = new Node(5);
		a.left = c;
		a.right = d;
		Node e = new Node(6);
		b.right = e;
		int result = max(root);
		System.out.println(result);

	}

}
