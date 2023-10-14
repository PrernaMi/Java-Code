package Queue;

public class LinkedList_Implementation {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static class Queue{
		Node head = null;
		Node tail = null;
		private int size = 0;
		
		void push(int x) {
			Node temp = new Node(x);
			if(head == null) {
				head = temp;
				tail = temp;
			}else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		
		int pop() {
			int x = head.data;
			head = head.next;
			size--;
			return x;
			
		}
		
		int peek() {
			return head.data;
		}
		
		void display() {
			Node a = head;
			while(a != null) {
				System.out.print(a.data+" ");
				a = a.next;
			}
		}
		
		int size() {
			return size;
		}
		
		boolean isEmpty() {
			if(head == null) return true;
			else return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q =new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		System.out.println(q.pop());
		System.out.println(q.peek());
		q.display();
		

	}

}
