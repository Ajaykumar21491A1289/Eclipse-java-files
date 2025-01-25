package CheatSheet;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m= sc.nextInt();
int sum = Calculator(n,m);
System.out.println(sum);
	
	}

	private static int Calculator(int n, int m) {
		int totalsum=0;
		for(int i=n;i<=m;i++) {
			if(i%3==0 && i%5==0)
				totalsum+=i;
		}
		return totalsum;
	}

}
