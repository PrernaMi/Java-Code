package Trees_1;


public class Diameter_Of_Tree {
	
	public static class  Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int height(Node root) {
		if(root == null)return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	
	public static int diameter(Node root) {
		if(root == null)return 0;
		int op1 = diameter(root.left);
		int op2 = diameter(root.right);
		int op3 = height(root.left)+height(root.right)+1;
		return Math.max(op1, Math.max(op2, op3));
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
		Node g = new Node(8);
		f.right = g;
		int res = diameter(root);
		System.out.println(res);
	}

}
