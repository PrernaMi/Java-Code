package Stacks;

public class Array_Implementation {
	
	public static class Stack{
		
	  private int arr[] = new int[6];
	  private int idx = 0;
	  
	  void push(int x) {
		  if(isFull()) {
			  System.out.println("stack is Full");
			  return;
		  }
		  arr[idx] = x;
		  idx++;
	  }
	  
	  int peek() {
		  if(idx == 0) {
			  System.out.println("Stack is empty");
			  return -1;
		  }
		  return arr[idx-1];
	  }
	  
	  int pop() {
		  if(idx == 0) {
			  System.out.println("Stack is Empty");
			  return -1;
		  }
		  int val = arr[idx-1];
		  arr[idx-1] =0;
		  idx--;
		  return val;
	  }
	  void display() {
		  if(isEmpty()) {
			  System.out.println("Stack is Empty");
			  return;
		  }
		  for(int i = idx-1 ; i >= 0 ; i--) {
			  System.out.print(arr[i]+" ");
		  }
	  }
	  
	  int size() {
		  return idx;
	  }
	  
	  boolean isEmpty() {
		  if(idx == 0) return true;
		  else {
			return false;
		}
	  }
	  
	  boolean isFull() {
		  if(idx == arr.length) return true;
		  else return false;
	  }
	  
	}

	public static void main(String[] args) {
		Stack st = new Stack();
//		st.push(7);
//		st.push(8);
//		st.push(3);
//		st.push(65);
//		st.push(67);
//		st.push(65);
//		st.push(56);
		st.display();
//		System.out.println(st.size());
//		System.out.println(st.peek());

	}

}
