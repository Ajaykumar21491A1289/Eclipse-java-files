/*Problem Statement:
Write a function that takes an integer n
as input and returns the sum of all
prime numbers less than n.
Input: 10
Output: 17
Explanation:
The prime numbers less than 10 are 2,
3, 5, and 7.
Their sum is 17.
*/
package StudyHour;
import java.util.*;
public class PrimeNumberSum {

	public static void main(String[] args) {
		
    int n=4;
    int i=2 , sum=0;
    while(i<n) {
    	if(n%i == 0) {
    		System.out.println("This is not a prime number");
    		break;
    	}
    	i++;
    }
    if(i==n) {
    	System.out.println("This is a prime");
    }
	}

}
