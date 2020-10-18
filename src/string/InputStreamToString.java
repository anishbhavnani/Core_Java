package string;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is=new ByteArrayInputStream("Hello World".getBytes());
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		
		String line;
		StringBuilder sb=new StringBuilder();
		while((line=br.readLine())!=null)
			sb.append(line);
		
		System.out.println(sb);
	}

}
