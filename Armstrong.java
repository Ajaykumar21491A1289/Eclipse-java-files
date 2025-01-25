package online;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();//371
		int m = n;
		int sum = 0,rem;
		String s=String.valueOf(n);
		int r=s.length();
		while (n != 0)
		{
			rem = n % 10;
			int a=1;
			for(int i=r;i>0;i--) 
				a=a*rem;
			sum = sum + a ;
			
			n = n / 10;
		}
		//System.out.println(sum);
		if (m == sum)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");


	}

}
