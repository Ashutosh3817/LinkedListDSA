package linkedLists;

import java.util.LinkedList;

public class LinkedListsToStackAdapter {
	public static class Node{
		int data;
		Node next;
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size=0;
		
	    int size() {
	    	return size;
	    }
	    void push(int val) {
	    	Node temp = new Node();
	    	temp.data = val;
	    	temp.next = head;
	    	head = temp;
	    	if(size==0) tail = temp;
	    	size++;
	    }
	    void pop() {
	    	if(size==0) {
	    		System.out.println("List is empty");
	    	}
	    	else if(size==1) {
	    		head = tail=null;
	    		size=0;
	    		
	    	}
	    	else {
	    		System.out.println(head.data);
	    		head = head.next;
	    		size--;
	    	}
	    	
	    }
	    int top() {
	    	if(size==0) {
	    		System.out.println("List is empty");
	    		return -1;
	    	}
	    	else return head.data;
	    }
	}
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.push(10);
	li.push(20);
	li.push(30);
	li.push(40);
	li.push(50);
	li.pop();
	System.out.println(li.top());
	
}
}
