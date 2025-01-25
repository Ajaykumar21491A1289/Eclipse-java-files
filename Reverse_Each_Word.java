package CheatSheet;
import java.util.*;
public class Reverse_Each_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s= sc.nextLine();
StringBuffer s1=new StringBuffer(s);
s1.reverse();
String s2 =new String(s1);
String[] arr=s2.split(" ");
String s3="";
for(int i=arr.length-1;i>=0;i--) {
	s3+=arr[i]+" ";
}
System.out.println(s3);
	}

}
