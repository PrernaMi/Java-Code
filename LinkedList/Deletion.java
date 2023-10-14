package LinkedList;


import LinkedList.Revision.Linkedlist; 
import LinkedList.Revision.Node;

public class Deletion {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
		
	}
	public static class Linkedlist{
		Node head = null;
		Node tail = null;
		int size =0;
		
		void insertAtEnd(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				//If tail is given
				tail.next = temp;
				tail = temp;
			}
			size++;
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
			size++;
		}
		
		void insertAt(int idx , int data) {
			Node temp = new Node(data);
			if(idx == 0) {
				insertAtBegin(data);
				return;
			}else if(idx == size) {
				insertAtEnd(data);
				return;
			}else {
				Node t = head;
				for(int i = 1; i <= idx-1 ; i++) {
					t = t.next;
				}
				temp.next = t.next;
				t.next = temp;
			}
			size++;
		}
		
		void delete(int idx) {
			Node temp = head;
			if(idx == 0) {
				head = head.next;
				return;
			}
			for(int i =1 ;i <= idx-1 ; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			if(idx == size-1) {
				tail = temp;
			}
			size--;
		}
		
		int getAt(int idx) {
			Node temp = head;
			for(int i =1 ; i <= idx ; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Linkedlist ll = new Linkedlist();
		ll.insertAtEnd(23);
		ll.insertAtBegin(54);
		ll.insertAt(1, 77);
		ll.insertAt(3, 65);
		ll.insertAt(2, 53);
		ll.display();
		ll.delete(ll.size-1);
		ll.display();
		System.out.println(ll.head.data);
//		System.out.println("Data will be "+ ll.getAt(1));
//		System.out.println("Size of LinkedList "+ll.size);

	}

}
