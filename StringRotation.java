package Strings;
import java.util.*;
public class StringRotation {

	public static void main(String[] args) {
		String s ="NELLO";
		char[] arr =s.toCharArray();
		Arrays.sort(arr);
		String s1="LONEL";
		char[] arr1 =s1.toCharArray();
		Arrays.sort(arr1);
		boolean b=false;
		if(s.length() == s1.length()) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==arr1[i]) {
					b=true;
				}
				else {
					b=false;
				}
			}
		}
		System.out.println(b);
	}

}
