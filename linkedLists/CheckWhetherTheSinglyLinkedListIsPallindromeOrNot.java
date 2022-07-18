package linkedLists;

public class CheckWhetherTheSinglyLinkedListIsPallindromeOrNot {
	static class Node{
		Node next;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		int size=0;
		
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
	 boolean isPallindromeHelper(Node right){
		if(right==null)return true;
		boolean rres = isPallindromeHelper(right.next);
		if(rres==false) return false;
		else if(pleft.data!=right.data) return false;
		else {
			pleft = pleft.next;

			return true;
		}
	}
	 Node pleft;
	 boolean isPallindrome(Node head) {
		pleft=head;
		return isPallindromeHelper(head);
		
	}
	 public static void main(String[] args) {
		 LinkedList link = new LinkedList();
		 link.addLast(1);
		 link.addLast(2);
		 link.addLast(3);
		 link.addLast(2);
		 link.addLast(1);
		 
		 System.out.println(link.isPallindrome(head));
	 }
	}
}
