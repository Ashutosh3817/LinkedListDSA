package linkedLists;

public class MoveTheLastElementToTheFrontOfTheLinkedList {
	static class Node{
		int data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		static void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if(size==0) head=tail=temp;
			else {
				tail.next = temp;
				tail=temp;
			}
			size++;
		}
		
		static void moveToFront() {
			if(head==null && head.next==null)
				return;

			Node last = head;
			tail.next=head;
			head=tail;
			for(int i=0;i<size-2;i++) {
				last = last.next;
			}
			last.next = null;
			tail=last;
		}
		
		static void display() {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
			System.out.println("");
		}
public static void main(String[] args) {
	LinkedList link = new LinkedList();
	link.addLast(1);
	link.addLast(2);
	link.addLast(3);
	link.addLast(4);
	link.addLast(5);
	link.moveToFront();
	link.display();
}
	}
}
