package CheatSheet;
import java.util.*;

public class Max_Exponent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // Start of range
        int n2 = sc.nextInt(); // End of range
        int res = n1; // Variable to store the result number
        int maxExponent = 0; // Variable to store the maximum exponent

        // Loop through each number from n1 to n2
        for (int i = n1; i <= n2; i++) {
            int count = 0; // Counter for exponent of 2
            int num = i;

            // Count how many times the number can be divided by 2
            while (num % 2 == 0 && num > 0) {
                count++;
                num /= 2;
            }

            // Update the result if this number has a higher exponent or same but smaller number
            if (count > maxExponent) {
                maxExponent = count;
                res = i;
            }
        }

        // Output the result
        System.out.println(res);
    }
}
