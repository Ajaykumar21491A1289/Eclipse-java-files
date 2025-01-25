package CheatSheet;
import java.util.*;
public class Count_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
String arr[]=sc.nextLine().split(" ");
int arr1[]=new int[n];
for(int i=0;i<n;i++) {
	arr1[i]=Integer.parseInt(arr[i]);
}
int count=0;
for(int i=0;i<n;i++) {
	if((i%2==0 & arr1[i]%2== 0) || (i%2!=0 & arr1[i]%2!=0)){
		count++;;
	}
}
System.out.println(count);
	}

}
