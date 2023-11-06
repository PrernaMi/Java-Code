package Trees_1;


public class Symmetric_BT {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void invert(Node root) {
		if(root == null || root.left== null && root.right == null)return;
		 invert(root.left);
		 invert(root.right);
		Node tempr = root.right;
		Node templ = root.left;
		root.left = tempr;
		root.right = templ;
	}
	public static boolean same(Node p , Node q) {
		if(p == null && q == null)return true;
		if(p == null || q == null)return false;
		boolean c1 = same(p.left, q.left);
		boolean c2 = same(p.right, q.right);
		boolean c3 = p.data == q.data;
		if(c1 && c2 && c3 )return true;
		else return false;
	}

	public static boolean symmetric(Node root) {
		if(root == null)return true;
		invert(root.left);
		if(same(root.left,root.right))return true;
		else return false;
		
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
		Node f = new Node(7);
		b.left = e;
		b.right = f;
		boolean res = symmetric(root);
		System.out.println(res);

	}

}
