package CheatSheet;
import java.util.*;
public class TripleProductCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int s = sc.nextInt();
sc.nextLine();
String str= sc.nextLine();
String[] arr = str.split(" ");
int arr1[] = new int[arr.length];
for(int i=0;i<arr.length;i++) {
	arr1[i]=Integer.parseInt(arr[i]);
}
int result = contTriples(arr1,n,s);
System.out.println(result);
	}

	private static int contTriples(int[] arr1, int n, int s) {
		int count = 0;
		for(int i=0;i<s-2;i++) {
			for(int j=i+1;j<s-1;j++) {
				for(int k=j+1;k<s;k++) {
					if(arr1[i]*arr1[j]*arr1[k]==n) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
