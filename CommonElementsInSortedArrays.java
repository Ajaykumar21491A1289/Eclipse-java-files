package Sorting;

public class CommonElementsInSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int arr3[] = {8,9,10,11,12,13,14,15,16};
        
        // Indexes for each array
        int i = 0, j = 0, k = 0;

        // Iterate through all three arrays
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // Print the common element
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
