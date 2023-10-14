package LinkedList;


public class ReverseLL {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		
		void insertAtEnd(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
		}
		
		void display(Node head) {
			if(head == null) return;
			System.out.print(head.data+" ");
			display(head.next);
		}
		
		Node displayrev(Node h) {
			if(h.next == null) return h;
			Node newNode = displayrev(h.next);
			h.next.next = h;
			h.next = null;
			return newNode;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(6);
		ll.insertAtEnd(5);
		ll.insertAtEnd(8);
		ll.insertAtEnd(1);
		ll.display(ll.head);
		System.out.println();
		Node res = ll.displayrev(ll.head);
		ll.display(res);
	}

}
