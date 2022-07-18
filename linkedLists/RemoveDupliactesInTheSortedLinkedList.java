package linkedLists;

import linkedLists.DeleteLoopInALinkedList.LinkedList;

public class RemoveDupliactesInTheSortedLinkedList {
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
			temp.next = null;
			if(size==0) head = tail = temp;
			else {
				tail.next = temp;
				tail=temp;
			}
			size++;
		}
		static int getFirst() {
			if(size==0) {
				System.out.println("List Is Empty");
			}
			return head.data;
		}
		static void  removeFirst() {
			if(size==0) {
				System.out.println("List is empty");
			}
			if(size==1) {
				head=tail=null;
				size--;
			}
			else {
				head=head.next;
				size--;
			}
		}
		
		void display() {
			Node temp;
			for( temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
			System.out.println();
		}
		
		public static int size() {
			System.out.println(size);
			return size;
		}
		
		public void removeDuplicates() {
			 
			 LinkedList res = new LinkedList();
			 
			 while(this.size()>0) {
				  int val = this.getFirst();
				  this.removeFirst();
				  
				  if(res.size==0 || res.tail.data!=val)
					  res.addLast(val);
			}
		 
		 this.head = res.head;
		 this.tail=res.tail;
		 this.size=res.size;
		 }
		
		public static void main(String[] args) {
			LinkedList link = new LinkedList();
			LinkedList.addLast(2);
			LinkedList.addLast(2);
			LinkedList.addLast(2);
			LinkedList.addLast(3);
			LinkedList.addLast(3);
			LinkedList.addLast(4);
			LinkedList.addLast(5);
			LinkedList.addLast(5);
			
			link.removeDuplicates();
			link.display();
            link.size();
		}
	}
}
