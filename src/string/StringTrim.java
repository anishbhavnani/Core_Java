package string;

public class StringTrim {

	public static String removeSpace(String str){
		char[] newstr = new char[str.length()];
		
		int i=0;
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)!=' ')
				newstr[i++]=str.charAt(j);
		}
		
		return new String(newstr);
	}
	
	public static String removeLeftSpace(String str){
		
		int i=0;
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)!=' '){
				i=j;
				break;
			}
				
		}
		
		return str.substring(i);
	}
	
	
public static String removeRightSpace(String str){
		
		int i=0;
		for(int j=str.length()-1;j>=0;j--){
			if(str.charAt(j)!=' '){
				i=j+1;
				break;
			}
				
		}
		System.out.println("i : "+i);
		return str.substring(0,i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("  Hello World");
		String newstr=str.trim();
		System.out.println("Trim String :"+newstr);
		System.out.println("Remove all whitespace from String :"+newstr.replace(" ",""));
		System.out.println("Remove whitespace using removeSpace : "+removeSpace(str));
		System.out.println("Remove Left whitespace using removeLeftSpace : "+removeLeftSpace(str));
		System.out.println("Remove Left whitespace using removeRightSpace : "+removeRightSpace(str));
	}

}
