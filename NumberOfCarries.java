package Arrays;
import java.util.*;
public class NumberOfCarries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number one");
       int num1=sc.nextInt();
       System.out.println("Enter the Number 2");
       int num2=sc.nextInt();
       int rem1=0,rem2=0,sum=0,car=0,count=0;
       while(num1>0 || num2>0) {
    	   
    		   rem1=num1%10;
    		   rem2=num2%10;
    		   sum=rem1+rem2+car;
    		   if(sum>=10) {
    			   car++;
    			   count++;
    		   }
    		   else {
    			   car=0;
    		   }
    		   num1=num1/10;
    		   num2=num2/10;
    	   
       }
       System.out.println(count);
       
	}

}
