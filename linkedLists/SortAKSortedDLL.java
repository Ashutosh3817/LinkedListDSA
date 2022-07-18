package linkedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortAKSortedDLL {
	static class Node{
		Node next;
		Node prev;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
	static class compareNode implements Comparator<Node>	{
		public int compare(Node n1,Node n2) {
			return n1.data-n2.data;
		}
	}
	static void addLast(int val) {
		Node temp = new Node();
		temp.data= val;
		temp.next = null;
		if(size==0) head=tail=temp;
		else {
			tail.next = temp;
			tail=temp;
		}
		size++;
	}
	
	static Node sort(Node head,int k)  {
		
		if(head==null) return head;
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode());
		
		Node newHead=null ,last=null;
		
		for(int i=0;head!=null && i<=k; i++) {
			pq.add(head);
			//System.out.println(head.data);
			head=head.next;
		}
		while(!pq.isEmpty()) {
			if(newHead ==null) {
				newHead = pq.peek();
				newHead.prev = null;
				// 'last' points to the last node
		        // of the result sorted list so far
				last=newHead;
			}
			else {
				last.next = pq.peek();
				pq.peek().prev = last;
				last = pq.peek();
			}
			pq.poll();
			if(head!=null) {
				pq.add(head);
				head=head.next;
			}
		}
		last.next = null;
		return newHead;
	}
	
	static void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + ",");
			temp=temp.next;;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(3);
		list.addLast(6);
		list.addLast(2);
		list.addLast(12);
		list.addLast(56);
		list.addLast(8);
		
		//list.printList();
		list.sort(list.head, 4);
	    list.printList();
	    
	}
	
}
}