package linkedLists;

public class MiddleOfTheLinkedList {
	static class Node{
		Node next;
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
		
		static int  middleOfTheLinkedList() {
			Node slow =head;
			Node fast=head;
			while(fast.next!=null && fast.next.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			return slow.data;
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
		System.out.println(link.middleOfTheLinkedList());
	}
	}
}
