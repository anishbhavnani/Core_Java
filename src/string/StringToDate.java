package string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String dt="13/12/1990";
		System.out.println("String to Date : "+new java.util.Date(dt));
		//Date has default format of MM/DD/YYY. If MM>12 than it will add (MM - 12) to Month value
		System.out.println("String to Date using Format : "+new SimpleDateFormat("DD/MM/YYYY").parse(dt));
		//SimpleDateFormat constructor takes string variable in the format string should be
		
		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");		  

		LocalDate local_date_1 = LocalDate.parse(dt, formatter_1);

		System.out.println("Date conversion using Java 8 : "+local_date_1); //prints date in yyyy-mm-dd
	}

}
