package linkedLists;

public class DetectInALoopInALinkedList {
	public static class Node{
		Node next;
		int data;
	}
	public static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next=head;
			head=temp;
			if(size==0) {
				tail = temp;
			}
		
			size++;
		}
		void detect(Node head) {
			
			if(head==null || head.next==null) System.out.println("N");;
			Node slow=head;
			Node fast = head;
            int flag=0;
			while(slow!=null && fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			//	System.out.println(fast.data);

				if(fast==slow) {
					flag=1;
					break;
				}
			}
		if(flag==1) System.out.println("y");
		else System.out.println("N");
	}
	
	}
public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addFirst(20);
		link.addFirst(4);
		link.addFirst(15);
		link.addFirst(10);
		link.head.next.next.next.next = link.head.next.next;
		link.detect(LinkedList.head);
	}
}