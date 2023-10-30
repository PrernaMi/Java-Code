package Trees_1;

public class Sum_Tree {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int sum(Node root) {
		if(root == null )return 0;
		if(root.left == null && root.right == null)return root.data;
		return root.data+sum(root.left)+sum(root.right);
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
		int res = sum(root);
		System.out.println(res);

	}

}
