package linkedLists;

import linkedLists.RemoveFirstFromTheLinkedList.Node;

public class DeleteNodeHavingGreaterValueOnRight {
	static class Node{
		Node next;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
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
		 private static Node displayReverseHelper(Node node) {
			 if(node==null) {
				 return null;
			 }
			 displayReverseHelper(node.next);
			 return node;
			// System.out.print(node.data + " ");
		 }
		 
		 public void reverseIterative(Node head) {
			 displayReverseHelper(head);
			 System.out.println();
		 }                                                                                                                                                                                                
			public static void compute(Node head) {
			head = displayReverseHelper(head);
			Node curr = head;
			int max = head.data;
			Node prev = head;
			head = head.next;
			while(head!=null) {
				if(head.data>=max) {
					System.out.println(head.data);
					max = head.data;
					prev = head;
					head = head.next;
				}
				else {
					prev.next = head.next;
					head = prev.next;
				}
			}
		   head = displayReverseHelper(curr);
			}
		public void display(Node head) {
			Node temp;
			for(temp=head;temp!=null;temp=temp.next){
				System.out.print(temp.data + " ," );
			}
			System.out.println();
		}
	public static void main(String[] args) {
	     LinkedList list  = new LinkedList();
	     list.addLast(12);
	     list.addLast(15);
	     list.addLast(10);
	     list.addLast(11);
	     list.addLast(5);
	     list.addLast(6);
	     list.addLast(2);
	     list.addLast(3);
	     
	     compute(LinkedList.head);
	     list.displayReverseHelper(list.head);
	     compute(head);
	     list.display(head);
	}
	}

}
