package StudyHour;

import java.util.Scanner;

public class Move_Position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the array input
        System.out.println("Enter the array elements (space separated):");
        String s = sc.nextLine();
        String[] strArr = s.split(" ");  // Split based on spaces between elements

        // Convert string array to integer array
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        // Get the number of positions to move
        System.out.println("Enter the number of positions to shift:");
        int pos = sc.nextInt();

        // Create a new array to store the shifted elements
        int[] arr2 = new int[arr.length];

        // Shift elements by the given positions
        for (int i = 0; i < arr.length; i++) {
            int newPos = (i + pos) % arr.length;  // Calculate new position using modulo
            arr2[newPos] = arr[i];
        }

        // Print the shifted array
        System.out.println("Array after shifting by " + pos + " positions:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}