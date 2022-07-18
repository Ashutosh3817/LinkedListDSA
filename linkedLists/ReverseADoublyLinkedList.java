package linkedLists;

import linkedLists.FindPairsWithSumInDoublyLinkedList.Node;

public class ReverseADoublyLinkedList {
	static class Node{
		int data;
		Node next;
		Node prev;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data=val;
			temp.next=temp.prev = null;
			if(size==0) {
				//head=temp;
				head=tail=temp;
				}
			else {
				tail.next = temp;
				temp.prev = tail;

				tail = temp;
				//temp.next = head;
				//head.prev = temp;
				//head = temp;
			}
			size++;
		}
	static Node reverseADLL(Node head) {
		Node cur = head;
		if(cur==null && cur.next==null) return head;
		while(cur.next!=null)
			cur=cur.next;
		head=cur;
		
		while(cur!=null) {
			Node temp = cur.next;
			cur.next = cur.prev;
			cur.prev=temp;
			cur=cur.next;
		}

		return head;
	}
	public static void display(Node temp) {
		while(temp!=null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		System.out.println("Original linked list is");
		list.display(head);
		//list.reverseADLL(head);
		System.out.println();
		System.out.println("Reverse LinkedList is");
		list.reverseADLL(head);

		list.display(head);
	}
	}
}
