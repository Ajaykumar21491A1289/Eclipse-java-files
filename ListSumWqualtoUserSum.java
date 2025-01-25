package Arrays;

public class ListSumWqualtoUserSum {

	public static void main(String[] args) {
		int arr[]= {10,15,3,7};
		int sum=100;
		int val=0;
		boolean b =false;
		for(int i=0;i<arr.length;i++) {
			val=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				if(val+arr[j] == sum) {
					b=true;
					break;
				}
				
			}
		}
		if(b)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
