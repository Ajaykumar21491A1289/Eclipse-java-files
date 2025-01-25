package StudyHour;
import java.util.*;
public class FindCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements");
		String s1=sc.nextLine();
		String[] arr1 =s1.split(" ");
		int[] arr = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr[i]=Integer.parseInt(arr1[i]);
			
		}
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the difference");
		int diff=sc.nextInt();
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			
			if( arr[i]-num<=diff) {
				count++;
			}
		}
		System.out.println(count-1);

	}

}
