package Trees_1;

import java.util.ArrayList;

public class Binary_Tree_Path {
	
	public static class  Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void path(Node root , ArrayList<String> list ,String str){ 
		if(root == null)return;
		if(root.left == null && root.right == null) {
			str+=root.data;
			list.add(str);
			return;
		}
		
		path(root.left, list, str+root.data+"->");
		path(root.right, list, str+root.data+"->");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		Node a = new Node(2);
		Node b = new Node(1);
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
		ArrayList<String> list = new ArrayList<String>();
		path(root , list , "");
		System.out.println(list);

	}

}
