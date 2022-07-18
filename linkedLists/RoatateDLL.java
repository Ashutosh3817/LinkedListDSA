package linkedLists;

public class RoatateDLL {
	static class Node {
		Node next;
		Node prev;
		int data;
	}
	static class LinkedList{
		Node head;
		Node tail;
		int size=0;
		
	public void addLast(int val) {
		Node temp = new Node();
		temp.data = val;
		temp.next= null;
		
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	public void rotate(Node head,int N) {
		if(N==0) return ;
		Node current = head;
		int count=1;
		while(count<N && current!=null) {
			current = current.next;
			count++;
		}
		Node nthNode = current;
		while(current.next!=null) current=current.next;
		//current.next = head;
		current.next = head;
		head.prev =  current;
		head = nthNode.next;
		//head.prev = current;
		//head=nthNode.next;
		head.prev = null;
		nthNode.next = null;
	}
	public void display() {
		Node temp ;
		for(temp=head ;temp!=null;temp=temp.next) {
			System.out.print(temp.data + ",");
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		//ll.display();
		ll.rotate(ll.head, 2);
		ll.display();
	}
	}
}
