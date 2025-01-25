package Arrays;
import java.util.*;
public class SubArraySum {

	public static void main(String[] args) {
		int[] arr= {3,2,1,-4,6,3,1};
		int k=3;
		ArrayList<Integer> al = new ArrayList<>();
	
		for(int i=0;i<=arr.length-k;i++) {
			int s=0;
			 for (int j = i; j < i + k; j++) {
	                s += arr[j];
	            }
			al.add(s);
		}
		int min=al.get(0);
		for(Integer i: al) {
			if(i<min) {
				min =i;
			}
			
			
		}
		System.out.println(min);

	}

}
