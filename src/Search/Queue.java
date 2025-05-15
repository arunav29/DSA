package Search;

class Process {
	int pid, cpubrust;

	public Process(int pid, int cpubrust) {
		this.pid = pid;
		this.cpubrust = cpubrust;
	}
}

class ProcessQueue {
	Process queue[];
	int front, rear, size;

	public ProcessQueue(int capacity) {
		queue = new Process[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void eneque(Process process) {
		if (isfull()) {
			System.out.println("Overflow");
			return;
		}
		rear++;
		queue[rear] = process;
		size++;
		return;

	}
	public Process dequeue() {
		if(isempty()) {
			System.out.println("Underflow");
			return null;
		}
		Process p =queue[front];
		front++;
		size--;
		return p;
		
	}
	public boolean isempty() {
		return size==0;
	}

	public boolean isfull() {
		if (size == queue.length) {
			return true;
		}
		return false;
	}
}

public class Queue {
	public static void main(String[] args) {
		ProcessQueue pq = new ProcessQueue(5);
		pq.eneque(new Process(1, 3));
		int wait=0,curr=0,processcount=0;
		while(!pq.isempty()) {
			Process p = pq.dequeue();
			System.out.println("Process id: "+p.pid+" start: "+curr+" burst time: "+p.cpubrust);

			wait +=curr;
			curr+=p.cpubrust;
			processcount++;
		}
	}
}