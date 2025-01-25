package CheatSheet;
import java.util.*;
public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
ArrayList<Sum> a1 = new ArrayList<Sum>();
String s = sc.nextLine();
String[] arr =s.split(" ");
int[] arr1 = new int[arr.length];
for(int i=0;i<arr.length;i++) {
	arr1[i]=Integer.parseInt(arr[i]);
}
  for(int i=0;i<arr1.length-2;i++) {
	  for(int j=i+1;j<arr1.length-1;j++) {
		  for(int k=j+1;k<arr1.length;k++) {
			  if(i!=k && i!=j && j!=k && arr1[i]+arr1[j]+arr1[k]==0) {
				  Sum s1 = new Sum (arr1[i],arr1[j],arr1[k]);
				  a1.add(s1);  }}}}
  for(Sum num : a1) {
	  System.out.print(num.i);
	  System.out.print(num.j);
	  System.out.print(num.k);
  }
	}
	
}
class Sum{
	int i;
	int j;
	int k;
	
	public Sum(int i ,int j, int k) {
		this.i =i;
		this.j=j;
		this.k=k;
	}
}