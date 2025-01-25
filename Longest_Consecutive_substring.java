package StudyHour;
import java.util.*;
public class Longest_Consecutive_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a String");
String s =  sc.nextLine();
String lon="";
String curr="";
for(int i=0;i<s.length();i++) {
char c1=s.charAt(i);
curr+=c1;
if(i<s.length()-1) {
	char c2=s.charAt(i+1);
	if((int) c2 == (int) c1+1) {
		continue;
	}
	else {
		if(curr.length()>lon.length()) {
			lon=curr;
		}
		curr="";
		
	}
}
}
if(curr.length()>lon.length()) {
	lon=curr;
}
System.out.println(lon);
	}

}
