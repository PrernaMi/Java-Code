package Trees;

public class Tree_Imple {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		Node a = new Node(4);
		Node b = new Node(5);
		root.left = a;
		root.right = b;
		System.out.println(root.left.data);
		

	}

}
