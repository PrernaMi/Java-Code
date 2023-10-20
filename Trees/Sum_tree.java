package Trees;


public class Sum_tree {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	

	public static boolean sum(Node root) {
		if(root == null)return true;
        if(root.left == null && root.right == null)return true;
        boolean l = sum(root.left);
        boolean r = sum(root.right);
        int le = 0;
        int ri = 0;
        if(root.left!= null)le = root.left.data;
        if(root.right != null)ri = root.right.data;
        boolean res = (le+ri == root.data);
        if(l && r && res){
            root.data += le+ri;
            return true;
        }
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
		b.right = e;
		boolean res = sum(root);
		System.out.println(res);
	}

}
