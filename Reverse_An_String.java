package CheatSheet;

public class Reverse_An_String {

	public static void main(String[] args) {
		String s ="Hello";
		char[] arr=s.toCharArray();
		String s1="";
		for(int i=arr.length-1;i>=0;i--) {
			s1+=arr[i];
		}
		System.out.println(s1);

	}

}
//s[::-1]