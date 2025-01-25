package StudyHour;
import java.util.*;
public class ProductSmallestPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements");
		String s = sc.nextLine();
		String[] arr = s.split(" ");
		int arr1[] =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=Integer.parseInt(arr[i]);
		}
		System.out.println("Enter the sum value");
		int sum = sc.nextInt();
		Arrays.sort(arr1);
		int prod=0;
		if(arr1[0]+arr1[1]<=sum) {
			
			prod = arr1[0]* arr1[1];
		}
		System.out.println(prod);

	}

}
