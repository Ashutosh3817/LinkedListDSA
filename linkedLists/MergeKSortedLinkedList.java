package linkedLists;

public class MergeKSortedLinkedList {
	static class Node{
		Node next;
		int data;
	}
	static class LinkedList2{
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
			tail=temp;
		}
		size++;
	}
	}
	static class LinkedList1{
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
			tail=temp;
		}
		size++;
	}
	
	public static LinkedList1 mergeTwoSortedLinkedList(LinkedList1 li1,LinkedList2 li2) {
		Node one = li1.head;
		Node two = li2.head;
		LinkedList1 res = new LinkedList1();
		while(one!=null && two!=null) {
		if(one.data<two.data) {
			res.addLast(one.data);
			one = one.next;
		}
		else {
			res.addLast(two.data);
			two=two.next;
		}
	}
		while(one!=null) {
			res.addLast(one.data);;
			one=one.next;
		}
		while(two!=null) {
			res.addLast(two.data);
			two=two.next;
		}
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		LinkedList1 li1 = new LinkedList1();
		LinkedList2 li2=new LinkedList2();
		//LinkedList link=new LinkedList();

		li1.addLast(1);
		li2.addLast(4);
		li1.addLast(7);
		
		li2.addLast(2);
		li2.addLast(3);
		li2.addLast(5);
		
		li1.mergeTwoSortedLinkedList(li1, li2);
	}
	}
}
