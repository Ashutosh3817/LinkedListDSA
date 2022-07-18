package linkedLists;
import java.util.*;

public class MainLInkedLists {
	public static void main(String[]args) {
		MyLinkedLists myll = new MyLinkedLists();
		myll.add(34);
		myll.add(54);
		for(int i=1;i<=10;i++) {
			myll.add(i);
			
		}
		myll.Print();
	}
}
