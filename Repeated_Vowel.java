package CheatSheet;
import java.util.*;
public class Repeated_Vowel {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		int ca=0,ce=0,ci=0,co=0,cu=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
			{
			ca++;	
			}
			if(s.charAt(i)=='e') {
				ce++;
			}
			if(s.charAt(i)=='i') {
				ci++;
			}
			if(s.charAt(i)=='o') {
				co++;
			}
			if(s.charAt(i)=='u') {
				cu++;
			}
			
		}
		if(ca>ce && ca >ci && ca >co &&ca>cu )
			System.out.println("a");
		if(ce>ca && ce >ci && ce >co &&ce>cu )
			System.out.println("e");
		if(ci>ca && ci >ce && ci >co &&ci>cu )
			System.out.println("i");
		if(co>ca && co >ce && co >ci &&co>cu )
			System.out.println("o");
		if(cu>ca && cu >ce&& cu >ci &&cu>co )
			System.out.println("u");

	}

}
