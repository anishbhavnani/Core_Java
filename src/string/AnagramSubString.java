package string;

import java.util.Arrays;

public class AnagramSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] ch1="LISTEN".toCharArray();
			char[] ch2="asdf".toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int start1=-1;
			start1=new String(ch1).indexOf(new String(ch2));
			int start2=new String(ch2).indexOf(new String(ch1));
			System.out.println(start1>=0 || start2>=0);
	}

}
