package ArrayConvertTOList;
import java.util.*;
public class ArrayConvertToList {

	public static void main(String[] args) {
		String[] arr= {"java","Python","Php","C++"};
		System.out.println("Printing Array"+Arrays.toString(arr));
//Converting Array to List
		ArrayList<String> l = new ArrayList<String>();
		for(String i:arr) {
			l.add(i);
		}
		System.out.println(l);
;	}

}
