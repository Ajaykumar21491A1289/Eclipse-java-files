package StudyHour;

public class Add_Recursion {
	public static int add(int a,int b) {
		if(b==0) {
			return a;
		}
		else
			return add(a+1,b-1);
	}

	public static void main(String[] args) {
		
int a=10;
int b=20;
int sum=add(10,30);
System.out.println(sum);
	}

}
