package linkedLists;


public class MyLinkedLists {
	Node head;
	//we take the entry of elements
	void add(int data) {
		Node toAdd = new Node(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
	
	Node temp = head;
	while(temp.next != null) {
		temp = temp.next;
	}
	temp.next = toAdd;
	
}
	void Print() {
		Node temp= head;
		while(temp !=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	boolean isEmpty() {
		return head == null;
	}
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
			
		}
	}
}

