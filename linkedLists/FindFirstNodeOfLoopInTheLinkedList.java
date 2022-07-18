package linkedLists;

import linkedLists.DeleteLoopInALinkedList.LinkedList;

public class FindFirstNodeOfLoopInTheLinkedList {
	static class Node {
		Node next ;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if(size==0) {
				head=tail=temp;
			}
			else {
				tail.next = temp;
				tail=temp;
			}
			size++;
		}
		int getFirst(Node head) {
			Node slow=head;
			Node fast = head;
			while(slow!=null && fast!=null && fast.next !=null) {
				slow=slow.next;
				fast = fast.next.next;
				
			if(slow==fast) 
                 break;
			}
			/*if(slow==head) {
				while(fast.next != null) {
					fast=fast.next;
				}
				fast.next = null;
			}*/
			if(slow!=fast) return 0;
				slow=head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
			return slow.data;
		}
	
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.addLast(1);
	list.addLast(2);
	list.addLast(3);
	list.addLast(4);
	list.addLast(5);
	head.next.next.next.next.next = head.next.next;
	System.out.println(list.getFirst(LinkedList.head));
}
}
}
