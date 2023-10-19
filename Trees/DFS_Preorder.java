package Trees;

import java.util.ArrayList;
import java.util.Stack;


public class DFS_Preorder {
	
	public static class  Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	public static void preorder(Node root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Node> st = new Stack<>();
		st.push(root);
		while(st.size() > 0) {
			Node temp = st.peek();
			st.pop();
			list.add(temp.data);
			
			if(temp.right != null)st.push(temp.right);
			if(temp.left != null)st.push(temp.left);
		}
		System.out.println(list);
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
		b.left = e;
		Node f = new Node(7);
		b.right = f;
		preorder(root);

	}

}
