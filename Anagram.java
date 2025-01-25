package StudyHour;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s1=sc.nextLine();
String s2 = sc.nextLine();
char[] arr1=s1.toCharArray();
char[] arr2=s2.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);
System.out.println(Arrays.equals(arr1,arr2));
	}

}
