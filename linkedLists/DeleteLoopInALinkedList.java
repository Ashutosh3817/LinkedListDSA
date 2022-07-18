package linkedLists;


public class DeleteLoopInALinkedList {
	static class Node{
		int data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if(size==0) head=tail=temp;
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
	    void delete(Node head) {
			Node slow = head;
			Node fast = head;
			
			while(fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			
			if(slow==fast) {
				break;
			}
			}
			if(slow==head) {
				while(fast.next !=slow) {
					fast=fast.next;
				}
				fast.next=null;
			}
			else if(slow==fast) {
				slow=head;
				while(slow.next != fast.next) {
					slow=slow.next;
					fast = fast.next;
				}
				fast.next = null;
			}
		}
	    void display() {
	    	Node temp;
	    	for(temp=head;temp!=null;temp=temp.next) {
	    		System.out.println(temp.data);
	    	}
	    	System.out.println(" ");
	    }
public static void main(String[] args) {
	LinkedList link = new LinkedList();
	link.addLast(1);
	link.addLast(2);
	link.addLast(3);
	link.addLast(4);
	link.addLast(5);
	link.addLast(6);
	link.addLast(7);
	
	head.next.next.next.next.next.next.next = head.next.next  ;
	link.delete(LinkedList.head);
	link.display();

}
	}
}
