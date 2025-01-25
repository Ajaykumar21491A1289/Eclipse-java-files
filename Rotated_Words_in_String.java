package CheatSheet;

import java.util.Scanner;

public class Rotated_Words_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input
        int n = sc.nextInt();  // Size of the list (although not used in the logic)
        sc.nextLine();         // Consume the leftover newline
        String s = sc.nextLine();  // Input string of space-separated elements
        int r = sc.nextInt();   // Number of rotations

        // Splitting the input string into an array of strings
        String[] l = s.split(" ");

       for(int i=0;i<n;i++) {
    	   String temp=l[r];
    	   l[r]=l[0];
    	   l[0]=temp;
       }
String res = "";
       for(int i=0;i<l.length;i++) {
    	   res+=l[i];
    	   res+=" ";
       }
System.out.println(res);
        sc.close();  // Close the scanner
    }
}