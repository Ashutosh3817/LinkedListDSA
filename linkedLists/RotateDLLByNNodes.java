package linkedLists;

import linkedLists.ReverseADoublyLinkedList.Node;

public class RotateDLLByNNodes {
	static class Node{
		Node next;
		Node prev;
		int data;
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
				head.prev=null;
				tail.next=null;
				}
			else {
				tail.next = temp;
				temp.prev = tail;

				tail = temp;
				tail.next=null;
				//temp.next = head;
				//head.prev = temp;
				//head = temp;
			}
			size++;
		}
	static void rotate(Node head,int N) {
		if(N==0) return ;
		
		Node current = head;
		int count = 1;
		while(count<N && current!=null) {//current!=null because n is not to be greater than size of the linked list
			current = current.next;
			count++;
		}
		Node NthNode = current;
		
		while(current.next!=null) 
			current = current.next;
		
		current.next = NthNode;
		
		head.prev = current;
		
		head = NthNode.next;
		
		head.prev=null;
		
		NthNode.next = null;
	}
	static void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
	    list.addLast(3);
	    list.addLast(4);
	    list.addLast(5);
	    list.display();
	    list.rotate(list.head,4);
	    list.display();
	}
	}
}
