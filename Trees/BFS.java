package Trees;


public class BFS {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static int level(Node root) {
		if(root == null)return 0;
		int a = 0;
		int b = 0;
		if(root.left != null) {
			a = level(root.left);
		}
		if(root.right != null) {
			b = level(root.right);
		}
		return 1+Math.max(a, b);
	}
	
	public static void print(Node root , int n) {
		if(root == null)return;
		if(n == 1) {
			System.out.print(root.data+" ");
			return;
		}
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
		a.right = d;
		Node e = new Node(6);
		b.right = e;
		int n = level(root);
		for(int i =1 ; i <= n ; i++) {
			print(root, i);
			System.out.println();
		}
	}
}
