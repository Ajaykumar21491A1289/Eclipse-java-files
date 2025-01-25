package CheatSheet;
import java.util.*;
public class Intersection_Of_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the First Array Elements");
String s = sc.nextLine();
System.out.println("Enter the Second Array Elements");
String s1 = sc.nextLine();
char[] arr1 = s.toCharArray();
char[] arr2=s1.toCharArray();
//char[] arr3=new char[s.length()];
int count=0;
for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr2.length;j++) {
		if(arr1[i]==arr2[j]) {
		count++;
		break;
		}
			
	}
}
	System.out.println(count);
	
	}

}
