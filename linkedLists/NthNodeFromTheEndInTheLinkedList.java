package linkedLists;

public class NthNodeFromTheEndInTheLinkedList {
	static class Node {
		int data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data=val;
			temp.next=null;
			if(size==0) head=tail=temp;
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		public int nthFromTheEnd(int k) {
			Node s=head;
			Node f=head;
			
			if(k>size) return -1; 
				
			for(int i=0;i<k;i++) {
				f = f.next;
			}
			while(f!=tail) {
				s=s.next;
				f=f.next;
			}
			return s.data;
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

		link.addLast(8);
		System.out.println(link.nthFromTheEnd(5));
	}
	}
}
