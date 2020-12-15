package string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch1="LISTEN".toCharArray();
		char[] ch2="SILEENT".toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
	}

}
