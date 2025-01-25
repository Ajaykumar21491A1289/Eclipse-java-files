package NextWave;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int cur=4;
for(int i=0;i<n;i++) {
	for(int j=0;j<=i;j++) {
		if(j==0)
			System.out.print(i+1+" ");
		else {
			System.out.print(cur+" ");
			cur+=1;
		}
		
	}
	System.out.println();
}
	}

}
