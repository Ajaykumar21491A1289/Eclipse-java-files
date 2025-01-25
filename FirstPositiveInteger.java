package Arrays;

public class FirstPositiveInteger {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
				int maxsum=0;
				for(int i=1;i<=arr.length+1;i++) {
					maxsum=maxsum+i;
				}
				int sum=0;
				for(int i=1;i<=arr.length+1;i++) {
					for(int k=0;k<arr.length;k++) {
						//System.out.println(arr[k]);
						if(i == arr[k]) {
							
							sum=sum+i;
			
						}
						
					}
				}
				System.out.println(maxsum-sum);

	}

}
