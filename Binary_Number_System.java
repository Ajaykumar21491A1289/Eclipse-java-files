package CheatSheet;
import java.util.*;

public class Binary_Number_System {
    public static void main(String[] args) {
        // Input the binary string with operations
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Call the function and print the result
        System.out.println(OperationsBinaryString(str));
    }

    public static int OperationsBinaryString(String str) {
        // Return -1 if the string is null or empty
        if (str == null || str.length() == 0) {
            return -1;
        }
        
        // Initialize result with the first binary digit (index 0)
        int result = str.charAt(0) - '0';  // Convert char to integer

        // Traverse the string from the 1st character onward in steps of 2
        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);  // Get the operation character
            int nextValue = str.charAt(i + 1) - '0';  // Get the next binary digit (convert char to integer)
            
            // Perform the corresponding binary operation
            if (operation == 'A') {
                result = result & nextValue;
            } else if (operation == 'B') {
                result = result | nextValue;
            } else if (operation == 'C') {
                result = result ^ nextValue;
            }
        }
        
        // Return the final result after all operations
        return result;
    }
}
