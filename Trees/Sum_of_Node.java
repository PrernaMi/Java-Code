package Trees;


public class Sum_of_Node {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int sum(Node root) {
		if(root.left == null && root.right == null)return root.data;
		if(root.left != null && root.right != null) {
			return root.data+sum(root.left)+sum(root.right);
		}
		else if(root.left == null) {
			return root.data + sum(root.right);
		}else return root.data+sum(root.left);
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
		Node e = new Node(6);
		b.right = e;
		int res = sum(root);
		System.out.println(res);
	}

}
