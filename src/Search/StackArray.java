package Search;

public class StackArray {
	
	
	int[] arr;
	int top;
	int capacity;
	public StackArray(int size) {
		
		arr = new int[size];
		top = -1;
		capacity = size;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack overflow because your stack is already full");
			return;
		}
		else {
			top++;
			arr[top] = value;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow because your stack is already empty");
			return -1;
		}
		else {
			int value = arr[top];
			top--;
			return value;
		}
	}
	 public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty, cannot peek.");
	            return -1;
	        }
	        return arr[top];
	    }
	
	private boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(capacity == (top+1) ) {
			return true;
		}
		return false;
	}
	 public static void main(String[] args) {
	        StackArray stack = new StackArray(2);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Top element: " + stack.peek()); 
	        System.out.println("Popped element: " + stack.pop());      
	        System.out.println("Top element after pop: " + stack.peek());
	               
	    }
	
	
	
}