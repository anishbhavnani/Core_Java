package string;

public class ReverseString {

	public String revIter(String str){
		String s="";
		for(int i=str.length()-1;i>=0;i--){
			s=s+str.charAt(i);
		}
		return s;
	}
	
	public String revRecurse(String str){		
		if(str.isEmpty())
			return str;	
		return revRecurse(str.substring(1))+str.charAt(0);
	}
	
	public String revCharArr(String str){
		char[] c=str.toCharArray();
		for(int i=str.toCharArray().length-1;i>=0;i--)
			c[i]=str.charAt(str.length()-i-1);
		return c.toString();
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		ReverseString rs=new ReverseString();
		System.out.println("Using Iteration : "+rs.revIter(str));
		System.out.println("Using Recrusion : "+rs.revRecurse(str));
		System.out.println("Using toCharArray : "+rs.revRecurse(str));
		System.out.println("Using StringBuffer : "+new StringBuffer(str).reverse());
		
	}

}
