package linkedLists;

public class CloneALinkedListWithCloneAndRandomPointers {
	static class Node{
		
		Node next;
		Node random;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
	static void addLast(int val) {
		Node temp = new Node();
		temp.data = val;
		temp.next=null;
		if(size==0) head=tail=temp;
		else {
			tail.next = temp;
			tail=temp;
		}
		size++;
	}
	public Node copyRandomList(Node head) {
		Node iter = head;
		Node front =  head;
		//First Step : make copy of each node, and link them together
		//side-by-side in a single list.
		while(iter!=null) {
			front = iter.next;
			
			Node copy = new Node();
			copy.data = iter.data;
			iter.next = copy;
			copy.next = front;
			
			iter = front;
		}
		//Second step : Assign random pointers for the copy nodes
		iter=head;
		while(iter!=null) {
			if(iter.random!=null) {
				iter.next.random = iter.random.next;
			}
			iter = iter.next.next;
		}
		//Third step : restore the original list and extract the copy list
		iter=head;
		Node pseudoHead = new Node();
		Node copy = pseudoHead;
		
		while(iter!=null) {
			front = iter.next.next;
			
			//extract the copy
			copy.next=iter.next;
			copy= copy.next;
			
			//restore the original list
			iter.next = front;
			
			iter = front;
		}
		return pseudoHead.next;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.copyRandomList(list.head);
		list.display();
	}
	}
}
