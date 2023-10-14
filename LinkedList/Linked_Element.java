package LinkedList;


public class Linked_Element {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void resDis(Node head) {
		if(head == null) return;
		System.out.print(head.data+" ");
		resDis(head.next);
	}
	
	public static int lenRec(Node head , int count) {
		if(head == null) return count;
		return lenRec(head.next, count=count+1);
	}
	
	public static int len(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node x = new Node(1);//1 2 3 4 5
		Node y = new Node(2);
		Node z = new Node(3);
		Node v = new Node(4);
		Node w = new Node(5);
		x.next =y; //1 -> 2 3 4 5
		y.next =z; //1 -> 2 -> 3 4 5
		z.next =v; //1 -> 2 -> 3 -> 4 5
		v.next =w; //1 -> 2 -> 3 -> 4 -> 5
		//w.next -> Null
//	   Node temp = x;
//	   while(temp != null) {
//		   System.out.print(temp.data+" ");
//		   temp = temp.next
		
//	   }
		//Display Iteratively
//		display(x);
		//Display Recursively
//		resDis(x);
		//Display Length
//		int length = len(x);
		//Display Length Recursively
		int length = lenRec(x,0);
		System.out.println(length);
	}

}
