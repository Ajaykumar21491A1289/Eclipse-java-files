//sample pattern
package array;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter number of rows you want");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
		    System.out.println();

	}
	}

}

/*Enter number of rows you want
6
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
*/