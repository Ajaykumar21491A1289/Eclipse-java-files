package ReverseList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListReverse {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(4);
		l.add(4);
		l.add(2);
		l.add(23);
		Collections.reverse(l);
		Iterator i1 =l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			
		}
}
}