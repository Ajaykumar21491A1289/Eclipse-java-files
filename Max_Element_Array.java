package CheatSheet;
import java.util.*;
public class Max_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Array Elements");
String s = sc.nextLine();
String[] arr=s.split(" ");
int[] arr1 = new int[arr.length];
for(int i=0;i<arr1.length;i++) {
	arr1[i]=Integer.parseInt(arr[i]);
}
int max=arr1[0];
for(int i=1;i<arr1.length;i++) {
	if(arr1[i]>max)
		max=arr1[i];
	
}
System.out.println(max);
	}

}
