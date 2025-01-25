package SortingList;
import java.util.*;
public class SortingList {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(21);  
		  l.add(11);  
		  l.add(51);  
		  l.add(1);  
		Iterator i =l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		Collections.sort(l);
		Iterator i1 =l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			
		}
	}

}
