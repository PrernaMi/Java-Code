package Trees;

import java.util.*;
public class BFS_Using_Queue {
	
	public static class  Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	
	public static void BFS(Node root) {
		Queue<Node> bfs = new LinkedList<>();
		if(root != null)bfs.add(root);
		while(bfs.size() > 0) {
			Node temp = bfs.peek();
			if(temp.left != null)bfs.add(temp.left);
			if(temp.right != null)bfs.add(temp.right);
			int val = temp.data;
			System.out.println(val);
			bfs.remove();
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
		b.left = e;
		Node f = new Node(7);
		b.right = f;
		BFS(root);

	}

}
