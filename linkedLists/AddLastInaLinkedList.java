package linkedLists;

public  class AddLastInaLinkedList {
	public static  class Node{
		int data;
		Node next;
	}
	public  static class LinkedList{
		Node head;
		Node tail;
		int size;

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
		public int size() {
			System.out.println(size);
			return size;
		}
		public void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
		        temp = temp.next;
			}
		       System.out.println(); 
		
	}
	}
public static void main(String[] args) {
	LinkedList dl = new LinkedList();
	
	dl.addLast(20);
	dl.addLast(34);
	dl.size();
	dl.display();
	}
  }