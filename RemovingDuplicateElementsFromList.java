package RemovingDuplicateElementsFromList;
import java.util.*;
public class RemovingDuplicateElementsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s = new ArrayList<String>();
s.add("Apple");
s.add("Banana");
s.add("Apple");
s.add("Cherry");
s.add("Banana");

System.out.println(s);

//Converting to Set
HashSet<String> set = new HashSet<>(s);
ArrayList<String> s1= new ArrayList<String>(set);
System.out.println(s1);

	}

}
