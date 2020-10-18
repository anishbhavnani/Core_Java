package string;

public class IntToString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int str=123;
		System.out.println("Int to String using toString : "+Integer.toString(str));
		System.out.println("Int to String using valueOf : "+String.valueOf(str));
		System.out.println("Int to String using toString : "+new Integer(str).toString());
	}
}
