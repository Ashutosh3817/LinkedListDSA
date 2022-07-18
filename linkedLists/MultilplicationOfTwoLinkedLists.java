package linkedLists;

public class MultilplicationOfTwoLinkedLists {
	static class Node{
		Node next;
		int data;
	}
	static class LinkedList{
		static Node head;
		static Node tail;
		static int size=0;
		
		public void addLast(int val) {
			Node temp=new Node();
			temp.data = val;
			temp.next = null;
			if(size==0) head=tail=temp;
			else {
				tail.next = temp;
				tail=temp;
			}
			size++;
		}
     static long multiplyTwoLinkedLists(LinkedList l1,LinkedList l2) {     		
    	 long mod=1000000007;
    	 long sum1=0,sum2=0;
    	 Node li1=l1.head;
    	 Node li2 = l2.head;
    	 while(li1!=null) {
    		 sum1= (sum1*10+li1.data)%mod;
    		 System.out.println(li1.data);
    		 li1=li1.next;
    	 }
    	 while(li2!=null) {
    		 sum2 = (sum2*10+li2.data)%mod;
    		 System.out.println(li2.data);
    		 li2=li2.next;
    	 }
    	 return (sum1*sum2)%mod;
     }
     public static void main(String[] args) {
    	 LinkedList link1 = new LinkedList();
    	 LinkedList link2 = new LinkedList();
    	 LinkedList link = new LinkedList();
    	 link1.addLast(3);
    	 link1.addLast(2);
    	
    	 link2.addLast(2);
    	 System.out.println(link.multiplyTwoLinkedLists( link1, link2));
     }
}
}