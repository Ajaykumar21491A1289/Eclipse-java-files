package CheatSheet;
import java.util.*;

public class Googly_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int sum = 0;
        
        // Calculate the sum of the digits
        while (n > 0) {
            rem = n % 10;  // Get the last digit
            sum = sum + rem;  // Add it to the sum
            n = n / 10;  // Remove the last digit
        }

        // Check if the sum is a prime number
        boolean isPrime = true;

        if (sum <= 1) {
            isPrime = false;  // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(sum); i++) {
                if (sum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result based on whether the sum of digits is prime or not
        if (isPrime) {
            System.out.println("GOOGLY");
        } else {
            System.out.println("is not a prime number");
        }
    }
}
