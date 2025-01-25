package Strings;

public class StringBuffer_Methods {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("JAVA");
		sb.append("PRO");
		System.out.println(sb);//JAVAPRO
		
        int cap =sb.capacity();
        System.out.println(cap);//20
        
        char ch = sb.charAt(1);
        System.out.println(ch);//A
        
        StringBuffer del = sb.delete(1, 3);
        System.out.println(del);//JAPRO
        
        StringBuffer delch = sb.deleteCharAt(2);
        System.out.println(delch);//JARO
        
        sb.insert(1, "ey");
        System.out.println(sb);//JeyARO
        
        sb.replace(1, 3, "A");
        System.out.println(sb);//JAARO
	
	
	    sb.reverse();
	    System.out.println(sb);//ORAAJ
	    
	    sb.setCharAt(1, 'a');
	    System.out.println(sb);//OaAAJ
	    
	    String substr = sb.substring(1,3);
	    System.out.println(substr);//aA
	}
	
	

}
