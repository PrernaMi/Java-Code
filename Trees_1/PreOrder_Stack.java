package Trees_1;

import java.util.Stack;

public class PreOrder_Stack {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void bfs(Node root) {
		Stack<Node> st = new Stack<Node>();
		if(root != null)st.push(root);
		while(st.size() > 0) {
			Node temp = st.peek();
			System.out.print(temp.data+" ");
			st.pop();
			if(temp.right != null)st.push(temp.right);
			if(temp.left != null)st.push(temp.left);
		}
		
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
		bfs(root);

	}

}
