package linkedLists;

import java.util.HashMap;
import java.util.Map;

import linkedLists.ReverseADoublyLinkedList.Node;

public class CountTripletsInASortedDoublyLinkedListWhoseSumIsEqualToGivenValue {
	static class Node{
		Node next;
		Node prev;
		int data;
	}
	static class LinkedList{
		Node head;
		Node tail;
		int size=0;
		
		public void addLast(int val) {
			Node temp = new Node();
			temp.data=val;
			temp.next=temp.prev = null;
			if(size==0) {
				//head=temp;
				head=tail=temp;
				}
			else {
				tail.next = temp;
				temp.prev = tail;

				tail = temp;
				//temp.next = head;
				//head.prev = temp;
				//head = temp;
			}
			size++;
		}
	static int countTriplets(Node head , int x) {
		Node ptr,ptr1,ptr2;
		
		int count=0;
		
		Map<Integer,Node> map = new HashMap<Integer,Node>();
		
		for(ptr=head;ptr!=null;ptr=ptr.next) 
			map.put(ptr.data, ptr);
		
		for(ptr1=head;ptr1!=null;ptr1=ptr1.next) 
			for(ptr2=ptr1.next;ptr2!=null;ptr2=ptr2.next) {
				
				int p_sum = ptr1.data+ptr2.data;
				
				if(map.containsKey(x-p_sum) && map.get(x-p_sum)!=ptr1
						&& map.get(x-p_sum)!=ptr2) count++;
			
		}
		return count/3;
	}
	static void display(Node temp) {
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.addLast(1);
	list.addLast(2);
	list.addLast(4);
	list.addLast(5);
	list.addLast(6);
	list.addLast(8);
	list.addLast(9);
	//list.display(list.head);
	System.out.println(list.countTriplets(list.head, 17));
}
	}
}
