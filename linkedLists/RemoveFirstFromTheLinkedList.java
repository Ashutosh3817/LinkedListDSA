package linkedLists;

public class RemoveFirstFromTheLinkedList {
	public static class Node{
		int data;
		Node next;
	}
	public static class LinkedList{
		Node head;
		Node tail;
		int size=0;
		public void addLast(int val) {
			Node temp= new Node();
			temp.data = val;
			temp.next = null;
			if(size==0)
				head=tail=temp;
			else {
				tail.next=temp;
				tail=temp;
			}
			size++;
			
		}
		public int size() {
			System.out.print(size+ " ");
			return size;
		}
		public void display(){
			
			// temp=head;
//			while(temp!=null) {
					//	System.out.println(temp.data + " ");
						//temp=temp.next;
					//}
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data +" ");
			}
			System.out.println();
		}
		public void removeFirst() {
			if(size==0)
				System.out.println("List Is Empty");
			else if(size==1) {
				head=tail=null;
				size=0;
			}			
			else {
				head = head.next;
				size--;
			}
			
		}
		public int getFirst() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else {
				return head.data;
			}
		}
		public int getLast() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else
				return tail.data;
		}
		public int getAt(int idx) {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else if(idx<0 && idx>size) {
				System.out.println("Invalid Arguments");
				return -1;
			}
			else {
				Node temp=head;
				for(int i=0;i<idx;i++)
					temp= temp.next;
				return temp.data;
			}
		}
		public void addFirst(int val) {
			Node temp=new Node();
			temp.data = val;
			temp.next = head;
			head=temp;
			if(size==0) {
				tail=temp;
			}
			size++;
		}
		public void addAt(int idx,int val) {
			Node temp=new Node()	;
			if(idx<0 && idx>size) {
				System.out.println("Invalid Arguments");
			}
			else if(idx==0) {
				temp.data =val;
				temp.next = head;
				head=temp;
			}
			else if(idx==size) {
				temp.data = val;
				temp.next=null;
				tail=temp;
			}
			else {
				Node mode = new Node();
				mode.data=val;
				
				temp=head;
				for(int i=0;i<idx-1;i++) {
					temp=temp.next;
				}
				mode.next=temp.next; 
				temp.next=mode; 
				size++;
			}
			
		}
		public void removeLast() {
			if(size==0) {
				System.out.println("List Is Empty");
			}
			else if(size==1) {
				head=tail=null;
				size=0;
			}
			else {
				Node temp=head;
				for(int i=0;i<size-2;i++) {
					temp = temp.next;
				}
				tail=temp;
				temp.next=null;
				size--;
			}
		}
		
		private Node getNodeAt(int idx) {
			Node temp = head;
			for(int i=0;i<idx;i++) {
				temp = temp.next;
			}
			return temp;
		}
		
		public void reverse() {
			int li=0;
			int ri = size-1;
			while(li<ri) {
				Node right = getNodeAt(ri);
				Node left = getNodeAt(li);
				
				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				
				li++;
				ri--;
			}
	}
		////
	 public void reverselipointeriterativeapproach() {
		 Node prev = null;
		 Node curr = head;
		 while(curr!=null) {
			Node next = curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		 }
		 Node temp = head;
		 head = tail;
		 tail  = temp;
	 }
	 ////
	 public void removeAt(int idx) {
		 Node temp= head;
		 if(idx<0 && idx>=size)
			 System.out.println("Invalid Arguments");
		 else if(idx==0)
			 removeFirst();
		 
		 else if(idx==size-1)
			 removeLast();
		
		 else {
			  for(int i=0;i<idx-1;i++) {
				  temp = temp.next;
			  }
			  temp.next = temp.next.next;
			  size--;
		 }
	 }
	 public int KthFromTheEnd(int k) {
		 Node s = head;
		 Node f = head;
		 
		 for(int i=0;i<k;i++) {
			 f = f.next;
		 }
		 while(f!=tail) {
			 s = s.next;
			 f = f.next;
		 }
		 System.out.print("kth from the end : ");
		 return s.data;
	 }
	 
	 public int MiddleOfTheLinkedList() {
		 Node s=head;
		 Node f=head;
		 
		 while(f.next!=null && f.next.next!=null) {
			 s = s.next;
			 f= f.next.next;
		 }
		 System.out.print("Middle of the linked list is : ");
		 return s.data;
	 }
	 
	 public static LinkedList mergeTwoSortedLinkedlist(LinkedList li1, LinkedList li2) {
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
		 while(one!=null) {
			 res.addLast(one.data);
			 one=one.next;
		 }
		 while(two!=null) {
			 res.addLast(two.data);
			 two = two.next;
		 }
		 return res;
	 }
	 
	 ////
	 public void removeDuplicates() {
		 
		 LinkedList res = new LinkedList();
		 
		 while(this.size()>0) {
			  int val = this.getFirst();
			  this.removeFirst();
			  
			  if(res.size==0 || res.tail.data!=val)
				  res.addLast(val);
		 }
	 
	 this.head = res.head;
	 this.tail=res.tail;
	 this.size=res.size;
	 }
	 
	 //
	 public void oddEven() {
		 LinkedList odd = new LinkedList();
		 LinkedList even = new LinkedList();
		 
		 while(this.size>0) {
			 int val = this.getFirst();
			 this.removeFirst();

			 if(val%2==0)
				 even.addLast(val);
			 else
				 odd.addLast(val);
		 }
		 if(odd.size>0 && even.size>0) {
		 odd.tail.next = even.head;
		 this.head = odd.head;
		 this.tail = even.tail;
		 this.size = odd.size + even.size;
	 }
		 else if(odd.size>0) {
			 this.head = odd.head;
			 this.tail = odd.tail;
			 this.size = odd.size;
		 }
		 else if(even.size>0) {
			 this.head = even.head;
			 this.tail = even.tail;
			 this.size = even.size;
		 }
		 }
	 
	 //
	 public void kReverse(int k) {
		 LinkedList prev = null;
		 
		 while(this.size>0) {
			 LinkedList curr = new LinkedList();
			 
			 if(size>k) {
			       for(int i=0;i<k;i++) {
				       int val = this.getFirst();
				       this.removeFirst();
				       curr.addFirst(val);
			 }}
			 else {
				 int os = this.size();
				 //you are writing size in variable because when you
				 //write size not in variable then size also decrease 
				 //when we remove node from this
				 for(int i=0;i<os;i++) {
					 int val = this.getFirst();
					 this.removeFirst();
					 curr.addLast(val);
				 }
			 }
			 if(prev==null)
				 prev = curr;
			 else {
				 prev.tail.next = curr.head;
				 prev.tail = curr.tail;
				 prev.size += curr.size;
			 }
		 }
		 this.head = prev.head;
		 this.tail = prev.tail;
		 this.size = prev.size;
	 }
	 
	 //Display Reverse(Recursive) Approach
	 
	 private void displayReverseHelper(Node node) {
		 if(node==null) {
			 return;
		 }
		 displayReverseHelper(node.next);
		 System.out.print(node.data + " ");
	 }
	 
	 public void displayReverse() {
		 displayReverseHelper(head);
		 System.out.println();
	 }
	 
	 //Reverse a LinkedList - Data Recursive Approach
	 
	 public void reverseDRHelper(Node right,int floor) {
		 if(right==null) return ;
		 
		 reverseDRHelper(right.next,floor+1);
		 
		 if(floor>=size/2) {
			 int temp = right.data;
			 right.data = rleft.data;
			 rleft.data = temp;
			 
			 rleft = rleft.next;
		 }
	 }
	 Node rleft;
	 public void reverseDR() {
		 rleft=head;
		 reverseDRHelper(head,0);
	 }
	 
	 //Is Linked List A Pallindrome
	 
	 public boolean IsPallindromeHelper(Node right) {
		 if(right==null) return true;
		 
		 boolean rres = IsPallindromeHelper(right.next);
		 //recursive result
		 if(rres ==false) return false;
		 else if(pleft.data != right.data) return false;
		 else {
			 pleft=pleft.next;
			 return true;
		 }
	 }
	 Node pleft;
	 public boolean isPallindrome() {
		 pleft = head ; 
		 return IsPallindromeHelper(head);
	 }   
	
	//Fold A LinkedList
	
	private void foldHelper(Node right , int floor) {
		if(right==null) {
			return;
		}
		foldHelper(right.next,floor+1);
		
		if(floor>size/2) {
		Node temp = fleft.next;
		fleft.next = right;
		right.next = temp;    
		fleft = temp;
		}
		else if(floor==size/2) {
			tail=right;
			tail.next = null;
		}
	}
	Node fleft;
	public void fold() {
		fleft=head;
		foldHelper(head,0);
	}
	
	///Intersection Point In The LinkedList
	public static int  findIntersection(LinkedList one ,LinkedList two) {
		Node t1 = one.head;
		Node t2 = two.head;
		
		int delta  = Math.abs(one.size - two.size);

		if(one.size > two.size) {
			for(int i=0;i<delta;i++) {
				t1 = t1.next;
			}
		}
		else {
			for(int i=0;i<delta;i++) {
				t2 = t2.next;
			}
		}
		while(t1.data != t2.data) {
			t1 = t1.next;
			t2 = t2.next;

		}
        return t1.data;
}
	
	/// Add Two Linked Lists
	
	public static int addListHelper(Node one , int pv1,Node two,int pv2,LinkedList res) {
		
		if(one == null && two == null) {
			return 0;
		}
		int data=0;
		
		if(pv1>pv2) {
			int oc = addListHelper(one.next,pv1-1,two,pv2,res);
			
			data = one.data + oc;
			
		}
		else if(pv2>pv1) {
			int oc = addListHelper(one,pv1,two.next,pv2-1,res);
			data = two.data + oc;
		}
		else {
			//old carry
			int oc = addListHelper(one.next,pv1-1,two.next,pv2-1,res);
			
			 data = one.data + two.data + oc;
		}
		int nd = data%10;
		//new data
		int nc = data/10;
		//new carry
		res.addFirst(nd);
		return nc;
	}
	public static LinkedList addTwoLists(LinkedList one , LinkedList two) {
		LinkedList res = new LinkedList();
		 
		int oc = addListHelper(one.head,one.size,two.head,two.size,res);
		if(oc>0) res.addFirst(oc);
		
		return res;
	}
	
}
public static void main(String[] args) throws NullPointerException{
	
	LinkedList link = new LinkedList();
	LinkedList li = new LinkedList();
	link.addLast(9);
	link.addLast(7);
	link.addLast(8);
 
	//System.out.println(link.getFirst());
	//System.out.println(link.getAt(1));
	link.addLast(5);
	//link.addLast(4);;
	//link.addLast(5);
	//link.addLast(6); 
	//link.addLast(7);
	li.addLast(4);
	li.addLast(6);
	//li.addLast(4);
	//li.addLast(5);
	//li.addLast(6);
	//li.addLast(7);
	//li.addLast(7);
	//li.addLast(8);
	
	//link.removeLast();
	// link.reverselipoi nteriterativeapproach();
	//link.removeAt(2);
	//System.out.println(link.KthFromTheEnd(2));
	
	///System.out.println(link.MiddleOfTheLinkedList());
	
	//System.out.println(LinkedList.mergeTwoSortedLinkedlist(link , li));
	//link.display();
	//link.removeDuplicates();
	//link.oddEven();
	//link.kReverse(3);
	//link.reverseDR();
	//System.out.println(link.isPallindrome());
	//System.out.println(LinkedList.findIntersection(link, li));
	//link.fold();
	LinkedList.addTwoLists(link, li).display();
	link.size();  
	link.display();
	
	
}
}
