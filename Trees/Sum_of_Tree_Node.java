package Trees;


public class Sum_of_Tree_Node {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int sum(Node root) {
		if(root == null)return 0;
		return root.data + sum(root.left)+sum(root.right);
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
		b.right = e;
		int result = sum(root);
		System.out.println(result);

	}

}
