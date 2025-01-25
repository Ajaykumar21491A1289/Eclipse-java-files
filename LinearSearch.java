package Searching;

public class LinearSearch {
public static int linearSearch1(int[] arr,int t) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==t) {
			return i;
		}
	}
	return -1; //Target not found
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {3,5,2,8,6};
int t=8;
int result=linearSearch1(arr,t);
System.out.println(result);
	}

}
