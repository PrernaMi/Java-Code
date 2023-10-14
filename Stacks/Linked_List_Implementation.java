package Stacks;

public class Linked_List_Implementation {
	
	public static class Node{
	    int data;
	    Node next;
	    Node(int data){
	    	this.data = data;
	    }
	    
	}
	
	public static class Stack{
		Node head = null;
		private int size =0;
		
		void push(int x) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}
		
		int pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}
			int val = head.data;
			head = head.next;
			return val;
		}
		
		int peek() {
			return head.data;
		}
		
		boolean isEmpty() {
			if(head == null) return true;
			else return false;
		}
		
		int Size() {
			return size;
		}
		
		void display() {
			reverse(head);
		}
		
		void reverse(Node h) {
			if(h == null) return;
			reverse(h.next);
			System.out.print(h.data+" ");
		}
	}

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		//it will display all the element of stack in right order
        st.display();
	}

}
