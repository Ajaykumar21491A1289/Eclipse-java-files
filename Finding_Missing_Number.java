package Arrays;
import java.util.*;
public class Finding_Missing_Number {

	public static void main(String[] args) {
		int n=7;
		int[] arr= {0,1,2,3,4,6,7};
		int esum=n*(n+1)/2;
		int tsum=0;
		for(int num:arr) {
			tsum=tsum+num;
		}
		System.out.println("Missing value is "+ (esum-tsum));

	}

}
