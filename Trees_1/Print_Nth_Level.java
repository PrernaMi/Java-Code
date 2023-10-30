package Trees_1;


public class Print_Nth_Level {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}

	public static void print(Node root , int n) {
		if(root == null)return;
		if(n == 1)System.out.print(root.data+" ");
		print(root.left, n-1);
		print(root.right, n-1);
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
		print(root,3);
	}

}
