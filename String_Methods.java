package Strings;

public class String_Methods {

	public static void main(String[] args) {
		String s1= new String("JAVA");
		String s2=new String("Programming");
		char c =s1.charAt(1);//Returns the character at the specifies index
		System.out.println(c);//A
		
		String s3=s1.concat(s2);
		System.out.println(s3);//JAVAProgramming
		
		boolean b= s1.contains("JAVA");
		System.out.println(b);//true
		
		boolean b1=s1.endsWith("A");
		System.out.println(b1);//true
		
		boolean b2=s1.equals(s2);
		System.out.println(b2);//false
		
		boolean b3=s1.equalsIgnoreCase(s2);
		System.out.println(b3);//false
		
		int i = s1.indexOf("J");
		System.out.println(i);//0
		
		boolean b4 = s2.isEmpty();
		System.out.println(b4);//false
		
		int len = s1.length();
		System.out.println(len);//4
		
		String s4=s1.replace('J', 'j');
		System.out.println(s4);//jAVA
		System.out.println(s1);//JAVA
		
		boolean b5 = s2.startsWith("Pr");
		System.out.println(b5);//true
		
		String substr=s1.substring(1);
		System.out.println(substr);//AVA
		
		String low=s1.toLowerCase();
		System.out.println(low);//java
		
		String upp=s2.toUpperCase();
		System.out.println(upp);//PROGRAMMING
		
		String val = String.valueOf(123);
		System.out.println(val);//123
		
	}

}
