package Trees_1;

public class Implementation {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void display(Node root) {
		if(root== null)return;
		System.out.print(root.data+"->");
		if(root.left != null)System.out.print(root.left.data+" ");
		if(root.right != null)System.out.print(root.right.data+" ");
		System.out.println();
		if(root.left != null)display(root.left);
		if(root.right != null)display(root.right);
		
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
		display(root);

	}

}
