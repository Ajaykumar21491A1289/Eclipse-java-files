package CheatSheet;
import java.util.*;
public class String_Palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.nextLine();
	char[] arr=s.toCharArray();
	String s1="";
	for(int i=arr.length-1;i>=0;i--) {
		s1+=arr[i];
	}
	char[] arr1=s1.toCharArray();
	boolean is_palindrome=true;
	for(int i=0;i<arr1.length;i++) {
		if(arr[i]!=arr1[i])
			is_palindrome=false;
	}
	if(is_palindrome)
		System.out.println("True");
	else
		System.out.println("False");

	}

}
