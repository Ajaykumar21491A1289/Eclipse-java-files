package ListConvertsToArray;
import java.util.*;
public class ListConvertsToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s = new ArrayList<>();
s.add("Ajay kumar");
s.add("Ajay1 kumar");
s.add("Ajay2 kumar");

s.add("Ajay3 kumar");
s.add("Ajay4 kumar");
//Converting ArrayList to Array

String[] arr =s.toArray(new String[s.size()]);
System.out.println("Printing Array: "+Arrays.toString(arr));  
System.out.println("Printing List: "+s);  
	}
	
	

}
