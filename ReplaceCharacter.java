package Arrays;
import java.util.*;
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String s= sc.nextLine();
System.out.println("Enter the character1");
char c1 =sc.next().charAt(0);
System.out.println("Enter the Character2");
char c2=sc.next().charAt(0);
char[] arr=s.toCharArray();
for(int i=0;i<arr.length;i++) {
	if(arr[i]==c1) {
		arr[i]=c2;
	}
	else if (arr[i]==c2) {
		arr[i]=c1;
	}
	
	
}
s=new String(arr);
System.out.println(s);
	}

}
