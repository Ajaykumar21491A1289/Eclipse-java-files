package CheatSheet;
import java.util.*;
public class DecimalTONBase {

    // Function to convert a decimal number to n-base notation
    public static String DectoNBase(int n, int num) {
        // List of valid characters for n-base notation (0-9 and A-Z)
        String notation = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();

        // Edge case for 0
        if (num == 0) {
            return "0";
        }

        // Perform the division and remainder method
        while (num > 0) {
            int remainder = num % n; // Get the remainder
            result.append(notation.charAt(remainder)); // Map to the corresponding character
            num = num / n; // Update num to the quotient
        }

        // The result is in reverse order, so reverse the string
        return result.reverse().toString();
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int num=sc.nextInt();

        String result = DectoNBase(n, num);
        System.out.println(result); // Expected output: "4BA"
    }
}

