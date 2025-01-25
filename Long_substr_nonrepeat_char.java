package CheatSheet;
import java.util.*;
public class Long_substr_nonrepeat_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] arr = s.toCharArray();
ArrayList<Character> al = new ArrayList<>();
ArrayList<Integer> al2 =  new ArrayList<>();

int j=0;
for(int i=0;i<arr.length;i++) {
	if(al.contains(arr[i])) {
		al2.add(al.size());
		continue;	
	}
	else {
		al.add(arr[i]);
	}
}
for(int i:al2) {
System.out.println(i);	}
	}
}
