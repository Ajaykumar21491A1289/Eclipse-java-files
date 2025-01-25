package ListDynamicInput;
import java.util.*;
public class ListDynamicInput {

	public static void main(String[] args) {
		ArrayList<Integer> l =new ArrayList<Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i=0;i<n;i++) {
        	System.out.println("Enetr element"+(i+1)+":");
        	 int element = sc.nextInt();
             l.add(element);
        }
	}

}
