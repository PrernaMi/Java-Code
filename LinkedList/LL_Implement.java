package LinkedList;

public class LL_Implement {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static class Linked_List{
		Node head = null;
		
		 void insertAtBeg(int data) {
			Node temp = new Node(data);
			if(head == null) {
				head = temp;
			}else {
				temp.next = head;
				head = temp;
			}
		}
		 
		 void display() {
			 Node temp = head;
			 while(temp != null) {
				 System.out.print(temp.data+" ");
				 temp = temp.next;
			 }
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List l1 = new Linked_List();
		l1.insertAtBeg(3);
		l1.insertAtBeg(4);
		l1.insertAtBeg(6);
		l1.insertAtBeg(7);
		l1.display();
	}

}
