package linkedLists;

import linkedLists.DeleteNodeHavingGreaterValueOnRight.Node;

public class FindPairsWithSumInDoublyLinkedList {
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
	static void pairSum(Node head,int x) {
		Node first = head;
		Node second = head;
		//if(second.prev==null)return ;
		while(second.next!=null) 
			second = second.next;
		
		boolean found = false;
		
		while(first!=second && second.next !=first) {
			if((first.data + second.data)==x) {
				found=true;
				System.out.println(" ( "+ first.data + " , " + second.data + " ) ");
				first=first.next;
				second = second.prev;
			}
			else {
				if((first.data + second.data)<x) first = first.next;
				else 
					second = second.prev;
 			}
		}
			if(found==false) 
				System.out.println("No pair Found ");	
	}
	public static void display(Node head) {
		Node temp;
		for(temp=head;temp!=null;temp=temp.next)
			System.out.print(temp.data + " ," );
		}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(8);
		list.addLast(9);
		display(head);
		list.pairSum(list.head,11);
	}
	}
}
