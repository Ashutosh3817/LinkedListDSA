package linkedLists;

public class SortAKSortedDoublyLinkedList {
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
		temp.data=val;
		temp.next=null;
		
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	
	public Node sortAKSortedDLL(Node head,int k) {
		
		if(head==null || head.next == null)  return head;
		
		for(Node i=head.next;i!=null;i=i.next) {
			Node j = i;
			
			while(j.prev!=null && j.data < j.prev.data) {
				Node temp = j.prev.prev;
				Node temp2 = j.prev;
				Node temp3 = j.next;
				j.prev.next = temp3;
				j.prev.prev = j;
				j.prev = temp;
				j.next = temp2;
				if(temp!=null) {
					temp.next=j;
				}
			}
		}
	}
	}
}
