package linkedLists;

public class LinkedListIsACircularLinkedList {
	static class Node{
		int  data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		static void addLast(int val) {
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
		static boolean isCircular(Node head) {
			if(head==null || head.next ==null) return false;
			
			Node slow = head;
			Node fast = head;
			
			while(fast.next!=null && fast.next.next!=null) {
				fast= fast.next.next;
				slow = slow.next;
				if(fast==slow) return true;
			}
			return false;
		}
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addLast(1);
		link.addLast(2);
		link.addLast(3);
		link.addLast(4);
		link.addLast(5);
		
		System.out.println(isCircular(head)?"Yes":"No");
		
		head.next.next.next.next.next = head;
		
		System.out.println(isCircular(head)?"Yes":"No");
	}
	}
}
