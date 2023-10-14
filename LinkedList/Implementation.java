package LinkedList;
 

public class Implementation {
	
	public static class Node{
		int data;
		Node next;
		 Node(int data) {
			 this.data = data;
		}
	}
	
	public static class Linkedlist{
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
		 
		 void insertAtHead(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head  = temp;
				tail = temp;
			}else {
				temp.next = head;
				head = temp;
			}
		 }
		 
		 void insertAt(int idx , int data) {
			 Node t = new Node(data);
			 if(idx == size()) {
				 insertAtEnd(data);
				 return;
			 }else if(idx == 0) {
				 insertAtHead(data);
				 return;
			 }else if(idx<0 || idx > size()) return;
			 Node temp = head;
			 for(int i =1 ; i <= idx-1 ; i++) {
				 temp =  temp.next;
			 }
			 t.next = temp.next;
			 temp.next = t;
		 }
		 
		 int getAt(int idx) {
			 Node temp = head;
			 for(int i = 1 ; i <= idx ; i++) {
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
		 
		 int size() {
			 int count =0;
			 Node temp = head;
			 while(temp != null) {
				 count++;
				 temp = temp.next;
			 }
			 return count;
		 }
		
	}

	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(6);
		ll.insertAtHead(100);
		ll.insertAt(1, 50);
		ll.insertAt(5, 87);
		ll.insertAt(6, 76);
		ll.insertAt(0, 65);
		ll.display();
		System.out.println("Element will be "+ ll.getAt(4));
		System.out.println("Size of LinkedList: "+ll.size());
		System.out.println(ll.tail.data);
		System.out.println(ll.head.data);

	}

}
