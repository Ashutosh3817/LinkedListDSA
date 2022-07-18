package linkedLists;

public class MultiplyTwoLinkedLists {
	public static class Node{
		Node next;
		int data;
	}
	public static class LinkedList1{
		static Node head;
		static Node tail;
		static int size = 0 ; 
		public static void addLast(int value) {
			Node temp = new Node();
			temp.data = value;
			temp.next = null;
			if(size==0) {
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
	}
	public static class LinkedList{
		static Node head;
		static Node tail;
		static int size = 0 ; 
		public static void addLast(int value) {
			Node temp = new Node();
			temp.data = value;
			temp.next = null;
			if(size==0) {
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		public long multiplyTwoLists(Node l1,Node l2){
		       long num1 = 0 , num2 =0;
		       long mod = 1000000007;
		      
		       while(l1!=null){
		           num1 = (num1*10 + (l1.data))%mod;
		           l1 = l1.next;
		       }
		       while(l2!=null){
		           num2 = (num2*10 + (l2.data))%mod;
		           l2 = l2.next;
		       }
		       System.out.println(num1 + "  |num1");
		       System.out.println(num2 + "  |num2");
		       System.out.println(num1*num2 + "  |num1*num2");
		       return (num1*num2)%mod;
		   
		}
	public static void main(String[] args) {
		LinkedList1 l1 = new LinkedList1();
		LinkedList l2 = new LinkedList();
		l1.addLast(32);
		l1.addLast(2);
		l2.addLast(2);
		System.out.println(l1.head.data);
		System.out.println(l2.head.data);
		System.out.println(l2.multiplyTwoLists(l1.head,l2.head));
	}
	}
}
