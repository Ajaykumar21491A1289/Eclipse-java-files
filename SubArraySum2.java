package Arrays;
import java.util.*;
public class SubArraySum2 {

	public static void main(String[] args) {
		int[] arr= {3,2,1,-4,6};
		int k=4;
		HashMap<Integer,Integer> al = new HashMap<>();
	
		for(int i=0;i<=arr.length-k;i++) {
			int s=0;
			 for (int j = i; j < i + k; j++) {
	                s += arr[j];
	            }
			al.put(s,i);
		}
		int minSum = Integer.MAX_VALUE;
        int minIndex = -1;
    
        for (Map.Entry<Integer, Integer> entry : al.entrySet()) {
            if (entry.getKey() < minSum) {
                minSum = entry.getKey();
                minIndex = entry.getValue();
            }
        }
    
   
        
        // Optionally, print the subarray itself
        System.out.print("Subarray with minimum sum: ");
        for (int l = minIndex; l < minIndex + k; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}