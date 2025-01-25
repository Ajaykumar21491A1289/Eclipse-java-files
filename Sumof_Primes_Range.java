package CheatSheet;
import java.util.*;
public class Sumof_Primes_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int sum=0;
for(int i= n1; i<=n2;i++) {
	boolean isprime=true;
	for(int j=2;j<Math.sqrt(i);j++) {
		if(i%j==0) {
			isprime=false;
		    break;
		}
	}
	if(isprime) {
		sum=sum+i;
	}
}
System.out.println(sum);
	
	}

}
