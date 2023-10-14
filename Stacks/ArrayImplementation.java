package Stacks;

public class ArrayImplementation {
	
	public static class Stack {
		
		private int arr[] = new int[10];
		private int idx = 0;
		
		void push(int x) {
			if(isFull()) {
				System.out.println("stack is Full");
				return;
			}
			arr[idx] = x;
			idx++;
		}
		
		int pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			
			int val = arr[idx-1];
			arr[idx-1] =0;
			idx--;
			return val;
		}
		
		int peek() {
			return arr[idx-1];
		}
		
		void display() {
			if(isEmpty()) {
				return;
			}
			for(int i = idx -1 ; i>=0 ; i--) {
				System.out.print(arr[i]+" ");
			}
		}
		
		boolean isEmpty() {
			if(idx == 0) return true;
			else return false;
		}
		
		boolean isFull() {
			if(idx == arr.length ) return true;
			else return false;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.display();
		

	}

}
