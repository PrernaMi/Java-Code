package LinkedList;

public class Implement {
	
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
			}else {
				tail.next = temp;
				tail = temp;
			}
		}
		
		void insertAtBegin(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
		}
		
		void insetAtmiddle(int data , int idx) {
			Node temp = new Node(data);
			if(idx == 0) {
				insertAtBegin(data);
				return;
			}
			Node a = head;
			for(int i = 1; i <= idx-1 ; i++) {
				a = a.next;
			}
			temp.next = a.next;
			a.next = temp;
			
		}
		
		void display() {
			Node a = head;
			while(a != null) {
				System.out.print(a.data+" ");
				a = a.next;
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insertAtEnd(3);
		l1.insertAtEnd(6);
	    l1.insertAtBegin(5);
	    l1.insetAtmiddle(8, 1);
	    l1.insetAtmiddle(8, 0);
		l1.display();
	}

}
