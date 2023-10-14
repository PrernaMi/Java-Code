package LinkedList;

public class LinkedList_Basic {
	
	public static class Node{
		int data;
		Node next;
		 Node(int data) {
			 this.data = data;
		}
	}

	public static void main(String[] args) {
		//1  2 45 75 64
		Node a = new Node(1);
		System.out.println(a);
		Node b = new Node(2);
		Node c = new Node(45);
		Node d = new Node(75);
		Node e = new Node(64);
		a.next = b;
		System.out.println(b);
		System.out.println(a.next);
		System.out.println(a.next.data);

	}

}
