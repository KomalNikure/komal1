package classes2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime myDateObj=LocalDateTime.now();
System.out.println("Before Formating:"+myDateObj);
DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


String formattedDate=myDateObj.format(myFormatObj);
System.out.println("After formatting:"+formattedDate);

	}

}
