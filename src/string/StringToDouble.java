package string;

public class StringToDouble {
	public static void main(String[] args) {
		String str="123.12";
		System.out.println("String to Double using parse : "+Double.parseDouble(str));
		System.out.println("String to Double using valueof : "+Double.valueOf(str));
	}
}
