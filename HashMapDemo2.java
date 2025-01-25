package Maps;
import java.util.*;
public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String,Integer> hs=new HashMap<>();
		hs.put("Apple",1);
		hs.put("Banana",2);
		hs.put("Cherr", 3);
		
		int appleCount = hs.get("Apple");
		//It is used to convert Map into Set
		Set s = hs.entrySet();
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}}}
