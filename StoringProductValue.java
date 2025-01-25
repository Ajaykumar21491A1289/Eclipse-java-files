package Arrays;

public class StoringProductValue {

	public static void main(String[] args) {
	   int arr[]= {1,2,3,4,5};
	  int arr1[]= new int[arr.length];
	   int mul=1;
	   for(int i=0;i<arr.length;i++) {
		   mul = 1;
		   for(int j=i+1;j<arr.length;j++) {
			   mul *= arr[j]; 
		   }
		   for(int k=i-1;k>=0;k--){
			   mul *=arr[k];
			   
			   
		   }
		   arr1[i]=mul;
	   }
	   for(int i=0;i<arr1.length;i++) {

		   System.out.println(arr1[i]);
	   }
	   
	   

	}

}
