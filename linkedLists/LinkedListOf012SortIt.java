package linkedLists;

public class LinkedListOf012SortIt {
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
    		temp.data=val;
    		temp.next=null;
    		if(size==0) head=tail=temp;
    		else {
    			tail.next = temp;
    			tail=temp;
    		}
    		size++;
    	}
    	void sortList() {
    		int count[] = {0,0,0};
    		
    		Node ptr = head;
    		while(ptr!=null) {
    			count[ptr.data]++;
    			ptr = ptr.next;
    		}
    		int i=0;
    		ptr=head;
    		
    		while(ptr!=null) {
    			if(count[i]==0) i++;
    			else {
    				ptr.data = i;
    				--count[i];
    				ptr=ptr.next;
    			}
    		}
    	}
    	public void display() {
    		Node temp;
    		for(temp=head;temp!=null;temp=temp.next) {
    			System.out.println(temp.data);
    		}
    		System.out.println();
    	}
    	public static void main(String[] args) {
    		LinkedList link = new LinkedList();
    		link.addLast(2);
    		link.addLast(1);
    		link.addLast(0);
    		link.addLast(2);
    		link.addLast(1);
    	    link.sortList();
    	    link.display();
    	}
    }
}
