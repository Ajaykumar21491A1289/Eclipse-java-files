package StudyHour;
import java.util.*;
public class Zerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     int[] arr=new int[6];
     int[] arr1=new int[6];
     int last=5,temp,first=0;
     for(int i=0;i<6;i++) {
    	 //System.out.println("enter "+i+"th element");
    	 arr[i]=sc.nextInt();
     }
     for(int i=0;i<6;i++) {
    	 if(arr[i]==0) {
    		 arr1[last]=arr[i];
    		 last--;
    		 
    		 
    	 }
    	 else {
    		 arr1[first]=arr[i];
    		 first++;
    	 }
     }
    	 for(int i=0;i<6;i++) {
    		System.out.println(arr1[i]);
    	 }
     }
     
     
	}

