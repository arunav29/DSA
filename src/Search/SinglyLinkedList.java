package Search;

class SinglyLinkedListNode {
	int data;
	SinglyLinkedListNode next;

	public SinglyLinkedListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {

	static SinglyLinkedListNode head;

	public void insertatbeg(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		newnode.next = head;
		head = newnode;
	}

	public void insertatend(int data) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		SinglyLinkedListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		temp = head;
		return;
	}

	public void insertatgivennode(int data, int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		if (head == null) {
			head = newnode;
			return;
		}
		SinglyLinkedListNode temp = head;
		while (temp.next != null && temp.data != value) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		return;
	}

	public void insertbeforenode(int data, int value) {
		SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
		if (head == null) {
			head = newnode;
			return;
		}
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode temp = head;
		while (temp.next != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		if(temp.data==value) {
			prev.next=newnode;
			newnode.next=temp;
		}
		else {
			System.out.println("The value is not in the linked list");
		}
	}

	public void deleteatbeg() {
		if(head==null) {
			return;
		}
		SinglyLinkedListNode temp = head;
		head=head.next;
		temp=null;
		return;
	}
	public void deleteend() {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode temp = head;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		temp=null;
		return;
	}
	public  void deleteinbetween(int value) {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode temp = head;
		while(temp.next!=null && temp.data != value) {
			prev=temp;
			temp=temp.next;
		}
		if(temp.data==value) {
			prev=temp.next;
			temp=null;
		}else {
			System.out.println("The value to be deleted is not in the linked list");
		}
	}
	public static void main(String[] args) {
		SinglyLinkedList ssl =new SinglyLinkedList();
		ssl.insertatbeg(25);
		
	}

}