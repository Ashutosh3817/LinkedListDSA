package linkedLists;

public class MergeSortALinkedList {
	public static class Node{
		Node next;
		int data;
	}
	//
	public static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
	
		
     //
	public static Node midNode(Node head,Node tail) {
		Node s = head;
		Node f = head;
		//while(f!=tail&&f.next!=tail)
		while(f!=tail&& f.next!=tail) {
			s = s.next;
			f=f.next.next;
		}
		return s;
	}
	//
	public  void addLast(int val) {
		Node temp = new Node();
		temp.data = val;
		temp.next = null;
		if(size==0) head=tail=temp;
		else {
			tail.next=temp;
			tail=temp;
		}
		size++;
		
	}
	//
	public static LinkedList mergeTwoSortedLinkedList(LinkedList li1,LinkedList li2) {
		Node one = li1.head;
		Node two = li2.head;
		
		LinkedList res = new LinkedList();
		while(one!=null && two!=null) {
			if(one.data<two.data) {
				res.addLast(one.data);
				one = one.next;
			}
			else {
				res.addLast(two.data);
				two = two.next;
			}
		}
		while(one!=null){
			res.addLast(one.data);
			one=one.next;
		}
		while(two!=null) {
			res.addLast(two.data);
			two=two.next;
		}
		return res;
	}
	//
	public static Node getLast(){
		if(size==0) {
			System.out.println("List Is Empty");
		}
		 return tail;
	}
	//
	public static Node getFirst(){
		if(size==0) {
			System.out.println("List Is Empty");
		}
		
		 return head;
	}
	//
	public static LinkedList mergeSort(Node head,Node tail) {
		 if(head==tail) {
			 //base result
			  LinkedList br = new LinkedList();
			  br.addLast(head.data);
			  return br;
		 }
		Node mid = midNode(head,tail);
		LinkedList fsh = mergeSort(head,mid);
		//first sorted half
		LinkedList ssh = mergeSort(mid.next,tail);
		//second sorted half
		LinkedList c1 = LinkedList.mergeTwoSortedLinkedList(fsh,ssh);
		return c1;
	}
	static void printList(Node head) {
		while(head.next!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
}
	public static void main(String[] args) throws IllegalArgumentException {
		LinkedList link = new LinkedList();
		link.addLast(2);
		link.addLast(8);
		link.addLast(3);
		link.addLast(4);
		link.addLast(6);
		link.addLast(5);
		link.addLast(3);
		link.mergeSort(link.getFirst(), link.getLast());
	     link.printList(link.getFirst());
	  }
}
