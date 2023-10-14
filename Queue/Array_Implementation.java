package Queue;

public class Array_Implementation {
	
	public static class Queues{
		private int arr[] = new int[60];
		private int add = 0;
		private int remove = -1;
		
		void push(int x) {
			if(isFull()) return;
			if(add == 0) {
				arr[add] = x;
				add++;
				remove++;
			}else {
				arr[add] = x;
				add++;
			}
		}
		
		int pop() {
			if(isEmpty()) return -1;
			int x = arr[remove];
			remove++;
			return x;
			
		}
		
		int peek() {
			if(isEmpty()) return -1;
			return arr[remove];
		}
		
		void display() {
			if(isEmpty()) return;
			int i = remove;
			for(int j = i ; j < add ; j++) {
				System.out.print(arr[j]+" ");
			}
		}
		
		int size() {
			return add-remove;
		}
		
		boolean isEmpty() {
			if(add == 0) return true;
			else return false;
		}
		
		boolean isFull() {
			if(add == arr.length-1) return true;
			else return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues qu = new Queues();
		qu.push(1);
		qu.push(2);
		qu.push(3);
		qu.push(4);
		qu.push(5);
		qu.push(5);
		System.out.println(qu.size());
		System.out.println(qu.peek());
		System.out.println(qu.pop());
		qu.display();
		
		

	}

}
