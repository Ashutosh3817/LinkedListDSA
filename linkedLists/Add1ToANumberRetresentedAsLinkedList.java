package linkedLists;

public class Add1ToANumberRetresentedAsLinkedList {
	static class Node{
		int data;
		Node next;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		static void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			head=temp;
			if(size==0) tail=temp;
			size++;
		}
		static void addLast(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next=null;
			if(size==0) head=tail=temp;
			else {
				tail.next=temp;
				tail=temp;
			}
			size++;
		}
		public static int addTwoListsHelper(Node one,int pv1,Node two,int pv2,LinkedList res) {
			
			if(one==null && two==null) return 0;
			int data=0;
			if(pv1>pv2) {
				int oc = addTwoListsHelper(one.next,pv1-1,two,pv2,res);
				data = one.data+oc;
			}
			else if(pv1<pv2) {
				int oc = addTwoListsHelper(one,pv1,two.next,pv2-1,res);
				data = two.data+oc;
			}
			else {
				int oc = addTwoListsHelper(one.next,pv1-1,two.next,pv2-1,res);
				data = one.data+two.data+oc;
			}
			int nd = data%10;
			int nc = data/10;
			res.addFirst(nd);
			return nc;
		}
		public static LinkedList addTwoLists(LinkedList one,LinkedList two) {
			LinkedList res = new LinkedList();
			
			int oc = addTwoListsHelper(one.head,one.size,two.head,two.size,res); 
			if(oc>0)
				 res.addLast(oc);
	                                                        
		}

public static void main(String[] args) {
	LinkedList link = new LinkedList();
	LinkedList list = new LinkedList();
	link.addFirst(size);
}
	}
}
