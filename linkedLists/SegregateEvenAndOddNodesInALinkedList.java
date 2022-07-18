package linkedLists;

public class SegregateEvenAndOddNodesInALinkedList {
	static class Node{
		int data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if(size==0) head=tail=temp;
			else {
				tail.next = temp;
				tail=temp;
			}
			size++;
		}
		
		public int getFirst() {
			if(size==0) return -1;
			return head.data;
		}
		
		public void removeFirst() {
			if(size==0) System.out.println("List is empty");
			
			else if(size==1) {
				head=tail=null;
			    size=0;
			}
			else {
				head=head.next;
				size--;
			}
		}
		public void sepearte() {
			LinkedList odd = new LinkedList();
			LinkedList even = new LinkedList();
			
			while(this.size>0) {
				int val=this.getFirst();
				this.removeFirst();
			
			if(val%2==1) 
				odd.addLast(val);
			else if(val%2==0) even.addLast(val);
		}
			if(odd.size>0 && even.size>0) {
				odd.tail.next = even.head;
				this.head=odd.head;
				this.tail=even.tail;
				this.size = odd.size+even.size;
			}
			else if(odd.size>0) {
				this.head=odd.head;
				this.tail=odd.tail;
				this.size=odd.size;
			}
			else {
				this.head=even.head;
				this.tail = even.tail;
				this.size=even.size;
			}
	}
		public void display() {
			Node temp;
			for(temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.data);
			}
			System.out.println();
		}
		public int size() {
			return size;
		}
		public static void main(String[] args) {
			LinkedList link= new LinkedList();
			link.addLast(1);
			link.addLast(2);
			link.addLast(3);
			link.addLast(4);
			link.addLast(5);

			link.addLast(6);
			link.addLast(7);

			link.addLast(8);
			link.sepearte();
			link.display();
			System.out.println(link.size());
		}
}
}