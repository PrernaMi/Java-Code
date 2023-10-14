package Trees;

public class Print_Nth_Level {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void nthLevel(Node root,int n) {
		if(root == null)return;
		if(n == 1) {
			System.out.print(root.data+" ");
			return;
		}
		nthLevel(root.left, n-1);
		nthLevel(root.right, n-1);
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
		nthLevel(root, 3);

	}

}
